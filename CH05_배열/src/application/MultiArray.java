package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중배열
		String[][] texts = { 
				{ "하나", "둘", "셋" }, 
				{ "넷", "다섯", "여섯" }, 
				{ "일곱", "여덟", "아홉" } }; 
		// 배열 안에 3개의 배열이 들어 있음

		// 이중배열의 길이 => 안에 있는 배열의 개수
		for (int i = 0; i < texts.length; i++) {
			/* System.out.println(texts[i]);
			 => 이중배열의 첫번째,두번째,세번째 주소가 출력됨 */
			
			for (int j = 0; j < texts.length; j++) {
				System.out.printf("%s\t", texts[i][j]);
			}			
			System.out.println(); //줄바꿈 하려고 넣은것
		}
	}
}
