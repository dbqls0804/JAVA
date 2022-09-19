package app;

import app.Person;

public class ClassObject {

	public static void main(String[] args) {
		// 쿨래스는 설계도로 실제 사용 가능한 객체를 생성
		Person p1 = new Person(); 
		/* new 키워드로 메모리에 Person 객체를 생성해줌 
		   Person 클래스(설계도)의 변수 p1에 주소가 저장됨 */
		p1.name = "펭수"; //p1 주소에 name 이라는 변수가 있음
		p1.age = 10;
		Person p2 = new Person(); 
		p2.name = "고양이"; //p2 주소에 name 이라는 변수가 있음
		p2.age = 20;
		// 클래스는 설계도, 객체는 찍어낼 수?있음
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}
