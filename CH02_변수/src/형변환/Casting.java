package 형변환;

public class Casting {

	public static void main(String[] args) {
		// 형 변환
		
		// 1. 자동 변환
		byte a = 32; // 정수 -127 ~ 128
		
		short b = a; // byte가 short로 자동변환
		
		int c = b; // short가 int로 자동변환
		
		long d = c; // int가 long 자동변환
		
		
		System.out.println(d);
		
		// 2. 명시적 변환(원래 안되지만 직접 변환시키는 것)
		long l = 1000000000; //직접 변환 : 변환할 타입으로 (타입)
		
		int g = (int)l; //long 타입을 int로 직접 변환(범위를 벗어나면 깨짐)
		
		System.out.println(g);
	}
}
