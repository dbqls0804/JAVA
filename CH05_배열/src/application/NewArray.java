package application;

import java.util.Scanner;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열 생성
		// int[] numbers = {}; 초기값을 바로 넣는 방법
		/*
		 * int[] numbers = new int[3]; // 3개짜리 데이터의 정수 아이템 방 생성 String[] strs = new
		 * String[3]; //3개 데이터의 문자열 아이템 방 생성
		 * 
		 * for(int i = 0; i < numbers.length; i++) { //값을 입력하지 않았을 때 int(정수)의 default 값은
		 * 0 System.out.println(numbers[i]); } for(int i = 0; i < strs.length; i++) {
		 * System.out.println(strs[i]); //값을 입력하지 않았을 때 String(문자열)의 default 값은 null }
		 */
		
		final int NUM = 3; //배열의 크기
		int[] numbers = new int[NUM]; //배열의 크기
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < NUM; i++) {
			System.out.print("숫자를 입력: ");
			numbers[i] = scanner.nextInt();
		}
		
		scanner.close(); //더 이상 입력 받지 않을 때(스캐너 닫기)
		
		System.out.println("입력한 값은: ");
		
		int total = 0;
		
		for (int i =0; i<NUM; i++) {
			System.out.println(numbers[i]);
			
			total += numbers[i];  // += 전부 더하기
		}
		
		System.out.println("Total: " + total);

	}
}
