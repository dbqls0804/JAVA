package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {

		// Integer(정수타입) < >안에 데이터 타입 입력
		ArrayList<Integer> list = new ArrayList<>();
		// add 메소드로 리스트의 타입 값을 입력
		list.add(7);
		list.add(9);
		list.add(123); // list.add("문자열은 불가");

		// 값을 가져올 때는 인덱스 번호 0번 부터~
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}

}
