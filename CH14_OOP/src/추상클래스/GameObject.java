package 추상클래스;

//추상 클래스는 abstract를 붙이고 완성되지 않은 클래스이다.
public abstract class GameObject {
	//추상 메서드 (함수 몸체가 없음-> 즉 내용 { 명령문 } 이 없다는 것)
	//추상 메서드를 상속 받은 자식클래스에서 각각 완성하라는 뜻
	public abstract void describe();
}

//자식
class Player extends GameObject {

	public void describe() {
		System.out.println("플레이어 자식 클래스");
		
	}

}
//자식
class Monster extends GameObject {

	public void describe() {
		System.out.println("몬스터 자식 클래스");
		
	}

}