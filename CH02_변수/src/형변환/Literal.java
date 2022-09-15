package 형변환;

public class Literal {

	public static void main(String[] args) {
		// 변수에 넣는 소스코드의 고정값
		
		// 1. 정수
		int a = 255; // 10진수 정수
		int b = 0146; //8진수 : 0
		int c = 0xFF; //16진수 : 0x
		int d = 0b11111111; // 2진수 : 0b
		long l = 12314445L; // Long
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(l);
		
		// 2. 실수
		float x = 100.123F; // f 플로트
		double y = 100.1234; // 더블은 기본
		
		System.out.println(x);
		System.out.println(y);
		
		// 3. 문자(char)
		char ch = 'a'; //한 따옴표 char타입
		char z = '\u0061'; // 유니코드 문자 : 유니코드 표현 시 \(역슬래시) 사용
		System.out.println(z);
		System.out.println("dfwg \"\" "); // 문자열 내에서 쌍 따옴표 표시하려면 \붙여주면 됨 

		// 4. 문자열 리터럴 쌍따옴표
		String s = "헬로우";
		System.out.println(s);
	}
}
