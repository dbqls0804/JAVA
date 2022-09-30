package demo;

import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ParsingJson {

	public static void main(String[] args) {
		// 파일 위치
		String src = "info.json";
		// 파일에서 제이슨 데이터를 가져옴 info.json으로부터 입력을 받음(Parsing)
		InputStream is = ParsingJson.class.getResourceAsStream(src);

		if (is == null) {
			throw new NullPointerException("파일이 없음");
		}

		JSONTokener tokener = new JSONTokener(is); // 제이슨 데이터를 tokener에 넣기
		JSONObject object = new JSONObject(tokener); // 제이슨 객체 변환
		//System.out.println(object.toString());
		
		//employee key값으로 employees배열을 가져옴
		JSONArray employees = object.getJSONArray("employees");
		//한 개의 JSONObject로 한 개씩 나눔
		for (Object emp : employees) { //Object타입으로 뺌
			JSONObject employee = (JSONObject)emp;
			System.out.println(employee.toString());
			
			//key를 이용하여 get (가져옴)
			System.out.print(employee.get("id") + "\t");
			System.out.print(employee.get("name") + "\t");
			System.out.println(employee.get("email"));
		}
	}

}
