package 자바시작하기;

public class EX8 {

	public static void main(String[] args) {
		// 연습문제 8
		
		int totalSec = 7582;
		int hour = totalSec/3600;
		int min = (totalSec/60)%60;
		int sec = totalSec%60;
		
		System.out.println(hour +"시간 "+ min +"분 " + sec + "초");
	}

}
