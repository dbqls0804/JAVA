package map;

import java.util.HashMap;

public class App {

	public static void main(String[] args) {
		// HashMap<K, V>은 key값으로 해당 value값을 가져옴
		HashMap<Integer, String> list = new HashMap<>();

		list.put(0, "펭수");
		list.put(1, "길동");
		list.put(3, "라이언");
		// key 값 중복불가이므로 같은 key일 경우 값은 가장 최신 값으로 업데이트됨
		list.put(4, "브레드");
		list.put(4, "마이클");
		list.put(10, "수지");

		System.out.println(list.get(4)); // key 값으로 value 가져옴
		// 람다식
		list.forEach((k, v) -> System.out.println(k + ": " + v));
		// 반복문(람다식 아닐 경우)
		for (String s : list.values()) {
			System.out.println(s);
		}
		for (int n : list.keySet()) {
			System.out.println(n);
		}
	}

}
