package 지역내부클래스;

public class App {
	String name;
	
	public App() {
		name = "엘리자베스";
	}

	
	public static void main(String[] args) {
		App app = new App();
		//System.out.println(app.name);
		app.run();
	}

	private void run() {
		/* Printer 클래가 run()메소드 내부에 들어가있음
		내부 클래스(Printer)는 밖에 있는 클래스(App)의 변수(name)를 사용 가능 */
		class Printer {
			public void print() {
				System.out.println(name); 
			}
		}
		new Printer().print();
	}
}
