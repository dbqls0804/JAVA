package application;

import java.util.Scanner;

public class NewArray_222 {

	public static void main(String[] args) {
		
		int[] numbers = new int[3];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("숫자를 입력 : ");
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close();
		
		System.out.println("입력한 값은 : ");
		int total = 0;
		
			
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
			total += numbers[i];
		}
		
		System.out.println("Total : " + total);
		
	}
}
