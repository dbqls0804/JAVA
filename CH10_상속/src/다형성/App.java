package 다형성;

public class App {

	public static void main(String[] args) {
		//클래스 타입 배열(부모-자식 간의 상속 관계처럼 관계가 있을 때 정의 가능)
		Cat[] cats = {new HouseCat(), new RoadCat(), new Tiger()}; 
		
		for(int i = 0; i <cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();			
		}
		
		// 확장된 for문 : for(타입 + 변수명 : 배열 또는 컬렉션) { }
		for ( Cat cat : cats) { 
			cat.vocal();
			cat.hunt();
		}
		
		// 업캐스팅 : 부모 타입으로 선언 (상속필요)
		Cat cat1 = new HouseCat();
		// 다운캐스팅 : 업캐스팅 객체를 다시 다운캐스팅시킴
		HouseCat cat2 = (HouseCat)cat1;

		
	}

}
