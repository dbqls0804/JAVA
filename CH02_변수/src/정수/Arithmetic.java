package 정수;

public class Arithmetic {

	public static void main(String[] args) {
		// 숫자 산술연산(정수 : int, 실수 : Double)
		System.out.println(7+3);
		System.out.println(9/3);
		System.out.println(10/3);  // 정수/정수=정수 이므로 답 3으로 나옴
		System.out.println(10.0/3.0); // 실수 double 이므로 답 3.33..
		System.out.println(9/4.0); // 하나는 실수로 변환해줌(9를 변환)
		System.out.println(3*4);
		System.out.println(3*4.0); // 하나는 실수로 변환
		System.out.println(3-4);
	}
}
