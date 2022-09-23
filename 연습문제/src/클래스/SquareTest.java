package 클래스;
//정사각형 객체의 넓이를 구하는 예
class Square {
	int length; // 길이

	// 넓이 리턴
	int area() {
		return length * length;
	}
}

public class SquareTest {

	public static void main(String[] args) {
		/* 1. 객체 생성 */
		Square s = new Square();
		/* 2. 필드 초기화(값 변경) */
		s.length = 5;
		/* 3. 결과 출력 */
		System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s.length, s.area());
	}
}
