package 상속;

class Animal {
	public void eat() {
		System.out.println("먹는다.");
	}
}

// Animal 클래스를 Bird 클래스가 extend 키워드로 부모-자식 상속 
class Bird extends Animal {
	public void fly() {
		System.out.println("하늘을 난다.");
	}
}

public class App {

	public static void main(String[] args) {
		
		Animal ani1 = new Animal();
		ani1.eat();
		
		Bird b1 = new Bird();
		b1.eat(); //부모의 메소드를 상속받음
		b1.fly();

	}

}
