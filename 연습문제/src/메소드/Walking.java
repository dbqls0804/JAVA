package 메소드;

public class Walking {

	public static void main(String[] args) {
		int walk = 5000;
		double result = calculateCalory(walk);
		System.out.printf("소모 칼로리 : " + result + " Kcal");
	}
	
	public static double calculateCalory(int walk) {
		return 0.02 * walk;
	}
}
