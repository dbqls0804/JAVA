package getterSetter;

public class Person {
	// private : 다른 클래스에서 접근 불가
	private String name;
	private int age;

	// get(값을 리턴) set(값을 입력) 메서드를 통해서만 변수에 접근 가능

	void setName(String name) { // void:리턴값 없음
		this.name = name; 
		// this.name은 private의 name이고, 뒤의 name은 String name을 뜻함)
	}

	String getName() {
		return name; // 이름을 리턴
	}

	void setAge(int Age) {
		this.age = Age; // 입력된 값으로 나이를 수정
	}

	int getAge() {
		return age;
	}
}
