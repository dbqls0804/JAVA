package application;

public class PreAndPost {

	public static void main(String[] args) {
		//증감연산자 위치 전 후
		int cat = 5;
		System.out.println(cat++); //연산 수행 후 1 증가 이므로 5로 출력
		System.out.println(cat); //1 증가된 6으로 출력
		
		int dog = 3;
		System.out.println(++dog); //연산 수행 전 1증가 되므로 4로 출력
		System.out.println(dog); //처음부터 1증가이니깐 4

		int chicken = 10;
		
		int animal = cat + chicken++;
		System.out.println(animal); 
		//cat 6 + chicken 10 = 16마리, 다음에 chicken은 11
		
		int apple = 5;
		int banana = 4;
		
		int fruit = ++apple + banana++;  
		//apple 6 + banana 4 = 10, 다음에 banana는 5
		System.out.println(fruit); 
	}
}
