package 리스트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();

		numbers.add(2);
		numbers.add(4);
		numbers.add(6);

		// 리스트의 아이템을 한줄 씩 출력하는 메소드
		displayList(numbers);
		
		List<Integer> list = new ArrayList<>();
		list.addAll(numbers); //numbers에 있는 아이템들은 list에 전부 추가
		list.add(8);
		list.add(10);
		System.out.println("0번 째 아이템은 " + list.get(0)); //아이템 가져오기 get
		
		list.remove(0); //아이템 제거 remove (인덱스 번호로 객체 타입도 있음)
		
		displayList(list);

	}

	private static void displayList(List<Integer> list) {
		list.forEach(x -> System.out.println(x)); // 람다식
	}

}
