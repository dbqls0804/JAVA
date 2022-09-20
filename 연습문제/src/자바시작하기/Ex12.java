package 자바시작하기;

public class Ex12 {

	public static void main(String[] args) {
		// 연습문제 12
		
		int num = 374;
		int oneDigit = num % 10;
		int tenDigit = (num / 10) - (num / 100)*10;
		int hunDigit = num / 100;
		
		int total = oneDigit + tenDigit + hunDigit;
		
		System.out.println("총합 : " + total);

	}

}
