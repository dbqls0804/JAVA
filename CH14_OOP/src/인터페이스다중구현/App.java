package 인터페이스다중구현;

public class App {

	public static void main(String[] args) {
		//person 클래스에서는 Speaker, Greeter이 인터페이스 되어 있어서 둘 다 사용 가능
		Person p1 = new Person();
		p1.greet();
		p1.speak();

		//Speaker 타입만 가능
		Speaker p2 = new Person();
		// p2.greet();
		p2.speak();
		
		//Greeter 타입만 가능
		Greeter p3 = new Person();
		p3.greet();
		//p3.speak();
	}

}
