package demo;

import com.google.gson.Gson;

public class App {

	public static void main(String[] args) {
		// json으로 변환하는 라이브러리 추가 후 gson객체 생성
		Gson gson = new Gson();
        //자바 클래스 객체를 JSON형태로 변환
//		Employee emp = new Employee(1234, "길동", "gill@google.com");
//		String jsonString = gson.toJson(emp);
//		System.out.println(jsonString);
		// 출력된 형식이 제이슨 형태가 맞는지 확인사이트 => https://jsonlint.com/

		//JSON객체를 java객체로 변환
		String jsonString = "{\"id\":1234,\"name\":\"길동\",\"email\":\"gill@google.com\"}"; 
		Employee emp = gson.fromJson(jsonString, Employee.class);
		System.out.println(emp);
	}

}
