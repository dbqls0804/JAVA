package 메소드;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.sayHi();
		
		p1.name = "펭수";
		p2.name = "고양이";
		p1.age = 7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.sayHi();
		p2.sayHi();
	}

}
