package try_catch_finally;

public class App {

	public static void main(String[] args) {

		Person p1 = new Person();
		try {
			p1.setName(null);
			// 여기 코드는 예외 발생 시 실행 안되고 catch문으로 감
		} catch (Exception e) {
			// 요기 코드는 예외 발생 시 실행됨
			System.out.println(e.getMessage());
		} finally { // try catch 문과 같이 사용하며 finally는 생략 가능
			// 무조건 실행되는 코드는 여기에 넣어주면 됨
			System.out.println("final => 무조건 실행");
		}

		System.out.println("프로그램 종료");
	}

}
