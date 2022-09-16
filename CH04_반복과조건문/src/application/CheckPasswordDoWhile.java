package application;

import java.util.Scanner;

public class CheckPasswordDoWhile {

	public static void main(String[] args) {
		// 입력한 패스워드를 설정 패스워드와 비교
		final String PASS = "1234";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = null;
		do {
			System.out.println("패스워드 : ");
			password = scanner.nextLine();
		} while (!password.equals(PASS)); 
		// 입력한 password와 PASS 변수의 데이터 값이 틀리면 무한 반복
		// 맞으면 "접속 승인" 반환
		System.out.println("접속 승인");
	}
}