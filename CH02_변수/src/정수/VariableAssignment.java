package 정수;

public class VariableAssignment {

	public static void main(String[] args) {
		// 변수 재할당 : 변수에 다른 값 입력 가능
		int x = 8;
		int y = 3;
		
		System.out.println("1. x: " + x);
		System.out.println("1. y: " + y);
		
		x = y;
		y = 10;
		
		System.out.println("2. x: " + x);
		System.out.println("2. y: " + y);
	}
}
