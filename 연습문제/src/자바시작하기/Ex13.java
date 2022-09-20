package 자바시작하기;

public class Ex13 {

	public static void main(String[] args) {
		//연습문제 13
		double time = 5.00;
		int Xo = 1000;
		double a = -9.81;
		double Vo = 0.0;
		
		double Xt = 0;
		Xt = (a*time*time)/2 + Vo*time + Xo ;
		
		System.out.printf("%.2f초 후 위치 : %.2fm\n", time, Xt);
	}
}
