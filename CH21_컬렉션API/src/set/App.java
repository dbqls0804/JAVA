package set;

import java.util.HashSet;

import javax.print.attribute.HashPrintServiceAttributeSet;

public class App {

	public static void main(String[] args) {
		// HashSet : 중복이 안되며 순서가 없음(인덱스 없음)
		HashSet<String> fruits = new HashSet<>();
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		

		System.out.println(fruits.contains("오렌지"));
		fruits.forEach(f -> System.out.println(f));
	}

}
