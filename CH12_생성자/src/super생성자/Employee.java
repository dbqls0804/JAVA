package super생성자;

public class Employee extends Person {
	
	public Employee(String name) {
		super(name); 
		//신경안써도 되지만 생략되어있음. 즉 부모 클래스를 실행하겠다는 뜻 부모클래스 생성자
		System.out.println("직원 생성자");
	}
}
