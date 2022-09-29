package 예외;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// 예외 : 프로그램 코드에 의해 수습될 수 있는 미약한 오류
		System.out.println("하나");
		Thread.sleep(2000); //2초 대기 상태
		System.out.println("둘");

	}

}
