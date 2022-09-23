package 인터페이스다중구현;

//인터페이스는 다중구현이 가능
//클래스 부모 상속은 하나의 클래스밖에 안되지만 인터페이스는 다중 구현 가능(기능만 구현하는거니깐)
public class Person implements Speaker, Greeter {

	@Override
	public void greet() {
		System.out.println("환영합니다.");
		
	}

	@Override
	public void speak() {
		System.out.println("나는 person입니다.");
		
	}
	

}
