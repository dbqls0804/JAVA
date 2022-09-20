package 메소드;

public class Diet {

	public static void main(String[] args) {
		double w = 49.8;
		double t = 1.60;

		double BMI = calculate(w, t);
		
		System.out.printf("BMI : %.2f(%.1fkg, %.2fm)\n", BMI, w, t);
		System.out.printf("결과 : %s\n", result(BMI));
	}
	
	private static double calculate(double weight, double tall) {
		return weight/(tall*tall);
	}
	
	//BMI 지수를 입력 받아 비만 결과를 반환
	public static String result(double BMI) {
		String result = "";
		
		if(BMI >= 30)         result = "비만";
		else if(BMI >= 25)    result = "과체중";
		else if(BMI >= 18.5)  result = "정상";
		else                  result = "저체중";
		
		return result;
	}
}
