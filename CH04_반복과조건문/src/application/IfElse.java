package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// if 조건문
		int apple = 10;
		int banana = 5;

		if (apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		}

		System.out.println("프로그램 종료!");

		Scanner scanner = new Scanner(System.in);
		System.out.printf("사과의 개수는 ? ");
		int Apple = scanner.nextInt();
		System.out.printf("바나나의 개수는 ? ");
		int Banana = scanner.nextInt();

		if (Apple > Banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		else {
			System.out.println("바나나가 사과보다 많음");
		}
	}
}
