package try_catch;

import java.util.Scanner;

public class App3 {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number); 
		scanner.close();
	}

	/** 공식 주석 달기 => /**
	 * 숫자를 입력받아서 정수로 리턴, 숫자가 아닐 시 반복
	 * @return int
	 */
	private static int getNumber() {
		
		int number = 0;
		boolean isNumber = false;
		
		do {
			System.out.println("숫자를 입력 : ");
			String line = scanner.nextLine();
			
			try { // try -> 예외가 발생할 수 있는 코드 넣기
				number = Integer.parseInt(line); //문자를 숫자로 변환
				isNumber = true; //변환 성공(숫자 입력 했음)
			} catch (NumberFormatException e) {
				// 예외 발생 시 출력 코드
				System.out.println("숫자 입력이 아닙니다.(문자열 숫자 변환 예외)");
			}
	
		} while(!isNumber);

		return number;
	}

}
