package 메소드;

public class Pork_Walking2 {

	public static void main(String[] args) {
		
		int n = 10;
		
		double result = calculateCalory(n);
		System.out.printf("삼겹살 %d인분 : %.2f kacl", n, result);
	}
	
	public static double calculateCalory(int PeopleNumber) {
		return PeopleNumber * 180 * 5.179;
	}
}
