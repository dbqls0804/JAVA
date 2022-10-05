package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class PublicData2 {

	public static void main(String[] args) throws IOException, ParseException {
		StringBuilder urlBuilder = new StringBuilder(
				"http://apis.data.go.kr/6260000/BusanAnimalHospService/getTblAnimalHospital"); /* URL Base 주소 */
		urlBuilder.append("?serviceKey="
				+ "o%2BNm39GgOgH3psOntrqZrjCkZhEy7z%2B9sD9hM7JZXPpS0IxFRIayGas4jBbXUpciZr5tMVGv2ny%2BG8QD5ibL8A%3D%3D"); // Service
																															// key

		urlBuilder.append("&page=1"); /* 페이지번호 */
		urlBuilder.append("&perpage=10"); /* 한 페이지 결과 수 */
		urlBuilder.append("&resultType=JSON");

		URL url = new URL(urlBuilder.toString()); // 주소로 URL객체 생성
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET"); // 요청메소드 get
		conn.setRequestProperty("Content-type", "application/json"); // 데이터 타입
		//System.out.println("Response code: " + conn.getResponseCode());
		BufferedReader rd;

		if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
			rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		} else {
			rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
		}
		StringBuilder sb = new StringBuilder();
		String line;
		while ((line = rd.readLine()) != null) {
			sb.append(line);
		}
		rd.close();
		conn.disconnect();
		// System.out.println(sb.toString());
		JSONParser jsonParser = new JSONParser(); // JSON 변환 객체 생성
		JSONObject jsonObject = (JSONObject) jsonParser.parse(sb.toString());
		JSONObject ob0 = (JSONObject) jsonObject.get("getTblAnimalHospital");
		JSONObject ob1 = (JSONObject) ob0.get("body");
		JSONObject ob2 = (JSONObject) ob1.get("items");
		JSONArray arr = (JSONArray) ob2.get("item");
		//System.out.println(arr);

		for (Object one : arr) {
			JSONObject ob = (JSONObject) one;
			System.out.print(ob.get("gugun") + "\t");
			System.out.print(ob.get("animal_hospital") + "\t");
			System.out.print(ob.get("approval") + "\t");
			System.out.print(ob.get("road_address") + "\t");
			System.out.print(ob.get("tel") + "\t");
			System.out.print(ob.get("lat") + "\t");
			System.out.print(ob.get("lon") + "\t");
			System.out.println(ob.get("basic_date"));

		}

	}

}
