package application;

public class App {

	public static void main(String[] args) {
		// 행맨 게임 시작
		Hangman game = new Hangman(); //행맨 객체 만들기
		game.run(); //게임 시작
		game.close(); //게임 종료
	}

}
