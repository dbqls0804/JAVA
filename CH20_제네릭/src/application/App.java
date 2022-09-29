package application;

import collections.Wrapper;
import 계층.Cat;
import 계층.Mammal;

public class App {
	public static void main(String[] args) {
		Wrapper<Cat> wrapper = new Wrapper<>();

		Cat cat = new Cat("마틸다");

		// 업캐스팅(Cat 객체 -> Object 타입에 입력)
		wrapper.set(cat);
		// 다운캐스팅(Object 타입 -> Cat 객체)
		Cat cat2 = (Cat) wrapper.get();
		System.out.println(cat2);

		Wrapper<Mammal> wrapper2 = new Wrapper<>();
		Mammal m1 = new Mammal("포유류");
		wrapper2.set(m1);
		Mammal m2 = wrapper2.get();
		System.out.println(m2);
	}

}
