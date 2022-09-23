package 클래스;

public class MinerTest {

	public static void main(String[] args) {
		// 1. 두 인부?사람의 객체 생성
		Miner Lee = new Miner("이씨");
		Miner Cha = new Miner("차씨");
		
		//2. 코인을 채굴하세요.(채굴 메소드를 사용해서 각각의 객체의 코인수를 늘림)
		Lee.mine();
		Lee.mine();
		Lee.mine();
		Cha.mine();
		Cha.mine();
			
		/* 3. 객체 정보를 출력하세요. */
		System.out.println(Lee.toString());
		System.out.println(Cha.toString());
	}
}

//코인 채굴 객채를 위한 클래스
class Miner {
	// 필드(인스턴스 변수)
	String name;
	int coins;

	// 생성자
	public Miner(String str) {
		name = str;
		coins = 0;
	}

	// 메소드(인스턴스 메소드) - 객체의 정보를 문자열로 반환

	@Override
	public String toString() {
		return String.format("Miner { name: %s, coins: %d }", name, coins);
	}
	
	//메소드(인스턴스 메소드) - 코인 채굴
	public void mine() {
		coins += 1;
	}
	
}
