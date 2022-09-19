package application;

public class ForEach {

	public static void main(String[] args) {
		// 배열의 for each 반복문
		String[] fruits = {"바나나", "사과", "수박"};
		
		for(int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		//for each => (하나의 아이템 : 배열)
		for (String s : fruits ) {
			System.out.println(s);
		}
	}
}
