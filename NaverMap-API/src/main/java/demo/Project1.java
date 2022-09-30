package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Project1 {

	private static String clientID = "2gd1q05vzi";
	private static String secretKEY = "cyolMvuNq1jVyO1E1XAfOqtIsB1yhVvgbyVdU6Ad";

	public static void main(String[] args) throws IOException, ParseException {

		Scanner scanner = new Scanner(System.in);
		System.out.print("주소를 입력: ");
		String address = scanner.nextLine();
		scanner.close();

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
		//System.out.println(sb.toString());
		JSONParser jsonParser = new JSONParser(); // JSON 변환 객체 생성
		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
		JSONArray arr = (JSONArray) jsonObject.get("addresses");

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			System.out.println("adress :" + ob.get("roadAddress"));
			System.out.println("jibunAddress : " + ob.get("jibunAddress"));
			System.out.println("경도: " + ob.get("x"));
			System.out.println("위도: " + ob.get("y"));

			String x = (String) ob.get("x");
			String y = (String) ob.get("y");
			String z = (String) ob.get("roadAddress");

			mapService(x, y, z);
		}
	}


	private static void mapService(String x, String y, String adress) throws IOException {
		// 위도, 경도, 값으로 지도 이미지 받아 오기(주소에 화살표 마크 표기)
		String mapUrl = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		String pos = URLEncoder.encode(x + " " + y, "UTF-8"); // 마커 표시를 위해 " " 공백 넣어줌

		mapUrl += "center=" + x + "," + y; // 경도 위도 위치
		mapUrl += "&level=16&w=700&h=500"; // 가로 세로 크기
		mapUrl += "&markers=type:t|size:mid|pos:" + pos + "|label:" + URLEncoder.encode(adress, "UTF-8");

		URL url = new URL(mapUrl);

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 연결 설정
		conn.setRequestMethod("GET"); // 요청방법 "GET"

		conn.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientID);
		conn.setRequestProperty("X-NCP-APIGW-API-KEY", secretKEY);

		int responseCode = conn.getResponseCode();
		
		BufferedReader br;
		if (responseCode == 200) {
			InputStream is = conn.getInputStream();
			byte[] bytes = new byte[1024];
			// 랜덤 이미지 파일 이름
			String time = Long.valueOf(new Date().getTime()).toString();
			File f = new File(time + ".jpg");// 파일이름을 시간으로 생성
			f.createNewFile(); // 파일 생성
			OutputStream outputStream = new FileOutputStream(f);
			int read = 0; // 이미지는 바이트로 받음
			while ((read = is.read(bytes)) != -1) {
				outputStream.write(bytes, 0, read);
			}
			outputStream.close();
			is.close();
		} else { // 에러 발생
			br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
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
