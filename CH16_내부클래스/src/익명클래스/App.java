package 익명클래스;

public class App {

	private String name = "펭수";
	
	public static void main(String[] args) {
		new App().start();
	}
	
	private void start() {
		//System.out.println(name);
		Runnable runner = new Runnable() { //이름 없는 클래스 시작부분
			public void run() {
				System.out.println(name); //또는 name 대신 App.this.name도 가능
			}
		}; //이름 없는 클래스 끝부분
		runner.run();
	}

}
