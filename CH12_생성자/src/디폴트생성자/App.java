package 디폴트생성자;

public class App {

	public static void main(String[] args) {


		Person p1 = new Person("베티"); 
		System.out.println(p1);
		
		Person p2 = new Person();
		System.out.println(p2);
		
		Person p3 = new Person("베티", 2);
		System.out.println(p3);

	}

}
