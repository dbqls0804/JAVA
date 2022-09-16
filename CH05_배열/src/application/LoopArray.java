package application;

public class LoopArray {

	public static void main(String[] args) {
		// 문자열 배열 (배열 내에 문자열만 가능)
		String[] animals = {"고양이", "개", "펭귄", "사자", "양", "말"};
		
		// 반복문으로 배열의 모든 아이템을 출력한다.
		
		for ( int i = 0; i < animals.length; i++) {
			System.out.printf("인덱스 %d : %s \n", i , animals[i]);
		}	
	}
}
