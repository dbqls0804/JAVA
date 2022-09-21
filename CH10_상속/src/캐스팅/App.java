package 캐스팅;

public class App {

	public static void main(String[] args) {
		//클래스 타입이 형 변환 (업/다운 캐스팅)
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		/* cat1.call(); 실제 객체는 HouseCat이 맞지만 Cat 타입이므로 
		   업캐스팅되어서 Cat의 메소드만 사용 가능함 */
		
		HouseCat cat2 = (HouseCat)cat1;
		cat2.call();
		/* Cat(부모) 타입에서 HouseCat(자식)으로 다시 다운캐스팅 되어서 
		   HouseCat(자식)의 메소드 사용 가능함 */
		
	}

}
