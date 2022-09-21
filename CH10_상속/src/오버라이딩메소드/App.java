package 오버라이딩메소드;

public class App {

	public static void main(String[] args) {
		
		HouseCat cat1 = new HouseCat(); 
		cat1.vocal(); //HouseCat(자식 클래스)의 vocal 메소드
		cat1.hunt(); //부모 Cat 클래스에 있는 hunt 메소드가 상속됨
		
		RoadCat cat2 = new RoadCat(); 
		cat2.vocal(); //부모 Cat 클래스에 있는 vocal 메소드가 상속됨
		cat2.hunt(); //부모 Cat 클래스에 있는 hunt 메소드가 상속됨

		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
	}
}
