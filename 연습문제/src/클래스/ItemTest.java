package 클래스;

public class ItemTest {

	public static void main(String[] args) {
		// 1. 아이템 객체 생성
		Item storm = new Item("스톰 브레이커", 600);
		Item gauntlet = new Item("인피니티 건틀렛", 999);
		Item bow = new Item("호크아이의 활", 50);
		Item shield = new Item("캡틴아메리카의 방패", 50);

		// 2. 객체 배열에 아이템 할당
		Item[] items = { storm, gauntlet, bow, shield };

		// 3. 모든 아이템 정보를 출력하세요.
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].toString());
		}
	}
}

class Item {
	// 4. 필드 생성
	String name;
	int Power;

	// 5. 생성자 생성
	public Item(String name, int Power) {
		this.name = name;
		this.Power = Power;
	}

	// 메소드(인스턴스 메소드) - 객체 정보를 문자열로 반환
	@Override
	public String toString() {
		return String.format("Item { name:%s, power: %d }", name, Power);
	}
}
