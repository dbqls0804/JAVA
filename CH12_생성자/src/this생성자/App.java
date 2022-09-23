package this생성자;

public class App {

	public static void main(String[] args) {


		Person p1 = new Person(); //정보는 모르지만 생성해야할 때 기본생성자로 생성
		System.out.println(p1);
		
		Person p2 = new Person("베티"); //이름만 알때
		System.out.println(p2);
		
		Person p3 = new Person("베티", 2); //이름 나이 다 알때
		System.out.println(p3);

	}

}
