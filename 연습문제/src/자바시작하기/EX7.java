package 자바시작하기;

import java.util.Scanner; //스캐너 클래스 및 패키지를 불러옴(Scanner치고 ctrl+space bar)

public class EX7 {

	public static void main(String[] args) {
		// 연습문제 7
		
		//콘솔에서 값을 입력받기
		Scanner scanner = new Scanner(System.in); // Scanner 클래스의 변수명을 scanner라고 지정
	    System.out.printf("숫자 입력 a : ");
	    int a = scanner.nextInt();
	    System.out.printf("숫자 입력 b : ");
		int b = scanner.nextInt();
		
		int c = a*b;
		int d = a/b;
		int e = a%b;
		
		System.out.printf("곱하기: %d X %d = %d\n", a, b, c);
		System.out.printf("나누기 몫: %d / %d = %d\n", a, b, d);
		System.out.printf("곱하기: %d / %d = %d\n", a, b, e);
	}
}
