package 인터페이스;

public class App {

	public static void main(String[] args) {
		// Object 클래스는 모든 클래스의 부모
		Describable[] objs = {new Person(), new Computer()};

		for (Describable obj : objs) {
			System.out.println(obj.getDescription());
		}

	}

}
