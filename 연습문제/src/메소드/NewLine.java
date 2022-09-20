package 메소드;

public class NewLine {

	public static void main(String[] args) {
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	
	}
	private static void threeLines() { 
		// void : threeLines(); 그냥 함수만 실행되는 것이므로 반환 값이 없음
		oneLine();
		oneLine();
		oneLine();
	}
	
	public static void oneLine() {
		System.out.println("<");
	}
}
