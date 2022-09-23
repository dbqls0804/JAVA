package application;

import game.Game; //다른 패키지에 있으므로 import 해줘야함

public class App {

	public static void main(String[] args) {
		
		/* Game game = new Game();
		   game.run(); 대신에 아래 처럼 표기 가능*/
		new Game().run(); //변수가 없는 상태라 지금은 get set 이 필요 없음

	}

}
