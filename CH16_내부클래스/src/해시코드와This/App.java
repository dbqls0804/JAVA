package 해시코드와This;

public class App {

	public static void main(String[] args) {

		Fox f1 = new Fox();
		System.out.println(f1);
		System.out.println(f1.toString()); //10진수로 나타낸 주소값(고유한 값)
		System.out.println(f1.hashCode());
		System.out.printf("%x\n", f1.hashCode()); //16진수로 변환

		Fox f2 = f1;
		System.out.println(f2);
		System.out.println(f2.name);
	}

}
