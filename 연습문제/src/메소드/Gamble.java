package 메소드;

public class Gamble {

	public static void main(String[] args) {
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, won);
	}
	
	public static int dice() {
		int rand = (int)(Math.random()*6)+1;
		return rand;
	}
	
	public static double exchange(double dollar) {
		return 1082.25108 * dollar;  
	}
}
