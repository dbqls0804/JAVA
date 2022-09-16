package application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {

		// 지역 변수
		{
			int value = 0; // { } 코드 블럭 안에서만 사용 가능
			System.out.println(value);
		}
		   //System.out.println(value);
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < 4 ; i++) {
			System.out.println(i); // for문의 { } 코드 블럭 안에서만 사용 가능
		}
			// System.out.println(i);
		
		// 전역 변수
		String input = null; // do { }안에서 사용 가능
		do {
			System.out.println("종료하려면 'stop'입력");
			input = scanner.nextLine();
		} while (!input.equals("stop"));	
		
	}
}
