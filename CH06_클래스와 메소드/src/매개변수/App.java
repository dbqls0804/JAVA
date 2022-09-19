package 매개변수;

public class App {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int num = 9;
		int result = calc.square(num);
		System.out.printf("%d의 제곱은 %d 이다.\n", num, result);

		result = calc.plus(15, 5);
		System.out.printf("입력된 두 수의 합은 %d 이다.\n", result);
		
		result = calc.minus(20, 10);
		System.out.printf("입력된 두 수의 차는 %d 이다.\n", result);
	}
}
