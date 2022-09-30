package gui;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class NaverMap {

	MainFrame mainFrame;
	private static String clientID = "2gd1q05vzi";
	private static String secretKEY = "cyolMvuNq1jVyO1E1XAfOqtIsB1yhVvgbyVdU6Ad";

	public NaverMap(MainFrame mainFrame) throws IOException, ParseException {
		this.mainFrame = mainFrame; // MainFrame에 있는 객체들 전달 받음
		// 주소 입력창의 주소가져오기
		String address = mainFrame.address.getText();
		// System.out.println(address);

		StringBuilder urlBuilder = new StringBuilder(
				"https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=");
		urlBuilder.append(URLEncoder.encode(address, "UTF-8"));
		// 한글 주소를 UTF-8로 인코딩해서 요청

		URL url = new URL(urlBuilder.toString()); // URL 주소 객체 생성
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// conn에 연결 설정
		conn.setRequestMethod("GET"); // 요청방법 "GET"
		conn.setRequestProperty("Content-type", "application/json");
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", secretKEY);

		BufferedReader br;
		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = br.readLine()) != null) {
			sb.append(line);
		}
		br.close();
		conn.disconnect();
		// System.out.println(sb.toString());
		JSONParser jsonParser = new JSONParser(); // JSON 변환 객체 생성
		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
		JSONArray arr = (JSONArray) jsonObject.get("addresses");

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			System.out.println("adress :" + ob.get("roadAddress"));
			System.out.println("jibunAddress : " + ob.get("jibunAddress"));
			System.out.println("경도: " + ob.get("x"));
			System.out.println("위도: " + ob.get("y"));

			AddressVO vo = new AddressVO();
			vo.setRoadAddress((String) ob.get("roadAddress")); // String으로 변환
			vo.setJibunAddress((String) ob.get("jibunAddress"));
			vo.setX((String) ob.get("x"));
			vo.setY((String) ob.get("y"));

			mapService(vo);

		}
	}

	private void mapService(AddressVO vo) throws IOException {
		// 위도, 경도, 값으로 지도 이미지 받아 오기(주소에 화살표 마크 표기)
		String mapUrl = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		String pos = URLEncoder.encode(vo.getX() + " " + vo.getY(), "UTF-8"); // 마커 표시를 위해 " " 공백 넣어줌

		mapUrl += "center=" + vo.getX() + "," + vo.getY(); // 경도 위도 위치
		mapUrl += "&level=16&w=700&h=500"; // 가로 세로 크기
		mapUrl += "&markers=type:t|size:mid|pos:" + pos + "|label:" + URLEncoder.encode(vo.getRoadAddress(), "UTF-8");
		URL url = new URL(mapUrl);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 연결 설정
		conn.setRequestMethod("GET"); // 요청방법 "GET"
		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", secretKEY);

		int responseCode = conn.getResponseCode();

		if (responseCode == 200) { // http 상태 정상일때
			InputStream is = conn.getInputStream(); // 이미지 받기위한 입력스트림
            Image image = ImageIO.read(is); //이미지 객체생성
			is.close();
			ImageIcon imageIcon = new ImageIcon(image);
			mainFrame.imageLabel.setIcon(imageIcon); //라벨에 이미지아이콘입력
			mainFrame.resAddress.setText(vo.getRoadAddress());
			mainFrame.jibunAddress.setText(vo.getJibunAddress());
			mainFrame.resX.setText(vo.getX());
			mainFrame.resY.setText(vo.getY());

		} else { // 에러 발생
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();
			conn.disconnect();
			System.out.println(response.toString());
		}
	}
}
