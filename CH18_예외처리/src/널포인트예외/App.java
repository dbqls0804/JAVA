package 널포인트예외;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// Null값 예외는 런타임 예외이기 때문에 예외처리를 안해도 됨
		//System.out.println(5/0); 실행 중 예외 발생
		
		Scanner scanner = null; //스캐너 객체가 없음
		scanner.nextLine();
		
	}

}
