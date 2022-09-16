package application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// if 조건문

		Scanner scanner = new Scanner(System.in);
		System.out.printf("사과의 개수는 ? ");
		int Apple = scanner.nextInt();
		System.out.printf("바나나의 개수는 ? ");
		int Banana = scanner.nextInt();

		if (Apple > Banana) {
			System.out.println("사과가 바나나보다 많음");
		}
		else if(Apple < Banana){
			System.out.println("바나나가 사과보다 많음");
		}
		else {
			System.out.println("바나나가 사과와 같음");
		}
	}
}
