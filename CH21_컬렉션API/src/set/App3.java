package set;

import java.util.Set;
import java.util.TreeSet;

import javax.print.attribute.HashPrintServiceAttributeSet;

public class App3 {

	public static void main(String[] args) {
		// HashSet : 중복이 안되며 문자순, 알파벳순, 숫자순 등으로 순서가 있음(인덱스 없음)
		Set<String> fruits = new TreeSet<>();
		Set<Integer> list = new TreeSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");

		list.add(158);
		list.add(5);
		list.add(5);
		list.add(1);
		list.add(15684968);
		
		

		System.out.println(fruits.contains("오렌지"));
		
		fruits.forEach(f -> System.out.println(f));
		list.forEach(n -> System.out.println(n));
	}

}
