package school;

public class App {

	public static void main(String[] args) {
		// 학생 객체 생성 
		Student s1 = new Student("철수", 28, true, 36.5);
		Student s2 = new Student("길동", 29, false, 34.4);
		Student s3 = new Student("라이언", 30, true, 33.9);
		Student s4 = new Student("피치", 31, false, 32.2);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
