package 메소드오버로딩;

public class App {

	public static void main(String[] args) {


		Person person = new Person(); //클래스 이름 ctrl+space = new ctrl+space
		
		person.greet();
		person.greet("펭수");
		//흔히 사용하는 println도 오버로딩의 예시임 
		System.out.println("문자열");
		System.out.println(123);
		System.out.println(true);

	}

}
