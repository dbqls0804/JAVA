package game;

import java.util.Scanner;

//import => 다른 패키지(game.objects)에 있는 클래스를 사용하기 위해서 넣어줘야 함
import java.util.Random;
import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissor;

public class Game {

	GameObject[] objects = { new Scissor(), new Rock(), new Paper() };
	Random random = new Random();
	Scanner scanner = new Scanner(System.in);

	public void run() {
		System.out.println("★게임 시작★\n");

		// 유저가 먼저 가위바위보 중 선택(입력)하도록 설정
		int result = 0;
		
		for (int i = 1; i <= 3; i++) {
			System.out.println(i + "번 째 게임 시작 합니다.");
		System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택 : ");

		// 랜덤으로 가위 바위 보가 출력됨
		GameObject ob1 = objects[scanner.nextInt()]; // 입력자 입력
		GameObject ob2 = objects[random.nextInt(objects.length)]; // 컴퓨터가 선택

		System.out.println("당신의 선택은 : " + ob1.getName()); // private로 되어 있으니깐 getName
		System.out.println("컴퓨터의 선택은 : " + ob2.getName());

		int score = (ob1.compareTo(ob2));
		
		whoWin(score);

		result += score;
		}
		
		System.out.println("\n======= "+"3번 게임 결과 총 점은 : " + result + " 점 =======");
	
		whoWin(result);
	}
		
		private void whoWin(int score) {
			if (score > 0) {
				System.out.println("당신이 이겼습니다!");
			} else if (score < 0) {
				System.out.println("당신이 졌습니다..");
			} else {
				System.out.println("비겼습니다.");
			}
		}
	}

