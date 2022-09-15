package application;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 불러옴

public class Userinput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // Scanner 클래스의 변수명을 scanner라고 지정
	    System.out.printf("섭씨 온도 입력 : ");
		Double input = scanner.nextDouble();  // 실수니깐 Double로 바꿔줌
	    
		double f = (input*9/5)+32; //화씨 (변환공식)
		
		System.out.println("섭씨 " + input + "는 화씨 " + f +"이다.");
	}
}