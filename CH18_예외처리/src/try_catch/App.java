package try_catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력 : ");
		String line = scanner.nextLine();
		
		int number = 0;
		boolean isNumber = false;
		
		try { // try -> 예외가 발생할 수 있는 코드 넣기
			number = Integer.parseInt(line); //문자를 숫자로 변환
			isNumber = true; //변환 성공(숫자 입력 했음)
		} catch (NumberFormatException e) {
			// 예외 발생 시 출력 코드
			// e.printStackTrace();
			System.out.println("숫자 입력이 아닙니다.(문자열 숫자 변환 예외)");
		}
		
		if(isNumber) {
			System.out.println("입력한 숫자는 : " + number); 
		}
	}

}
