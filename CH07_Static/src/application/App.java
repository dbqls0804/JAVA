package application;

public class App {

	public static void main(String[] args) {
	
		//스테틱 상수(변수)는 객체없이 사용
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println("카운트 : " + Cat.getCount());
		
		Cat c1 = new Cat("베티");
		System.out.println("카운트 : " + Cat.getCount());

		Cat c2 = new Cat("클로이");
		System.out.println("카운트 : " + Cat.getCount()); 
		
		Cat c3 = new Cat("Betty");
		System.out.println("카운트 : " + Cat.getCount()); //c1.getCount해도 증가
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		

		sayHi(); 
		//클래스명.스테틱메소드 => App.sayHi() 인데 어차피 App 클래스내라서 생략 가능
	}

	static void sayHi() {
		System.out.println("하이!");
	}
}
