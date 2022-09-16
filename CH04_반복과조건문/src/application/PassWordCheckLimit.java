package application;

import java.util.Scanner;

public class PassWordCheckLimit {

	public static void main(String[] args) {
		// 입력한 패스워드를 설정 패스워드와 비교
		final String PASS = "1234";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false; //초기 값은 false이고 맞췄을 때 true
		String password = null;
		
		for (int i = 1; i <= 3 ; i++) {
			System.out.printf("비밀번호 입력 : ");
			password = scanner.nextLine();
			if (password.equals(PASS)) {
				System.out.println("접속승인");
			    accessOK = true;
				break;
			} else {
				System.out.println("비번이 틀렸습니다.");
			}
			
		}
		
		if (accessOK == false) {
			System.out.println("접속거부");
		}
	}
}
