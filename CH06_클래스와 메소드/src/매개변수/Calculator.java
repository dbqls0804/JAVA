package 매개변수;

public class Calculator {
	
	// 정수 리턴하고 매개변수 x 입력
	int square(int x) {
		return x * x; // 입력된 x값을 제곱해서 리턴함
	}
	
	//두 개의 정수를 입력 받아 더한 값을 리턴
	int plus(int x, int y) {
		return x + y;
	}
		
	//두 개의 정수를 입력 받아 앞의 같에서 뒤의 값을 뺀 값을 리턴
	int minus(int x, int y) {
		return x - y;
	}
}
