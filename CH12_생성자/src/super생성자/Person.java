package super생성자;

public class Person {

	private String name;
	
	public Person(String name) {
		System.out.println("person(부모) 생성자");
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override //toString : 객체 정보 한눈에 보기 쉽게 하는것
	public String toString() {
		return name;
	}

}
