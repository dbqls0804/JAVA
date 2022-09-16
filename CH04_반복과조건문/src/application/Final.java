package application;

public class Final {

	public static void main(String[] args) {
		// Final 상수
		
		final int x = 9;
		// x = 10; 상수는 값을 다시 할당할 수 없음

		final String PASS = "abc";
		// PASS = "123"; 변경할 수 없음
		
		System.out.println(x);
		System.out.println(PASS);
	}
}
