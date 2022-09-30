package arrayList;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		list.add(7);
		list.add(9);
		list.add(123);
		list2.add("ㄱㄴㄷ");
		list2.add("ABC");
		list2.add("문자열");

		// 1. 일반적
		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println();

		// 2. 인덱스 번호를 함께 사용할 떄
		for (int i = 0; i < list.size(); i++) {
			int n = list.get(i);
			System.out.println(i + ":" + n);

		}

		// 3. 람다식
		list.forEach((n) -> System.out.println(n));
		list2.forEach((s) -> System.out.println(s));
	}

}
