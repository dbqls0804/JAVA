package 자바시작하기;

public class income {

	public static void main(String[] args) {
		// 연습문제 3
		
		double total = 8.62 + 10.23 + 12.48 + 7.82 + 9.54;
		
		System.out.println("$" + total);
		//printf 출력 양식 지정 가능
		System.out.printf("&%.2f", total);
		// 실수 표기는 %f (%.2f는 소수점 둘째자리까지 반환)
	}
}
