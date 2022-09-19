package school;

// 1. 변수 입력
public class Student {
	private String name;
	private int age;
	private boolean isvisible; // 출석 true, 결석 false
	private double temperature; // 온도 검사

	// 2. 생성자 모든 매개변수 입력서
	public Student(String name, int age, boolean isvisible, double temperature) {
		this.name = name;
		this.age = age;
		this.isvisible = isvisible;
		this.temperature = temperature;
	}

	// 3. getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isIsvisible() {
		return isvisible;
	}

	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	//4.toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isvisible=" + isvisible + ", temperature=" + temperature
				+ "]";
	}
}
