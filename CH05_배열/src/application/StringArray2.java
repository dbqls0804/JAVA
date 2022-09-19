package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 클래스타입 => 참조변수 (주소를 가짐)
		int x = 10; //기본 타입
		String s = "문자열"; 
		System.out.println(s);
		/* 참조 타입(문자열은 몇 byte를 쓸지 데이터 크기를 알 수 없기에 
		   공간을 정할 수가 없으므로 주소값을 부여함) */
		int [] arr = { 1,2,3,4,5,6,7 }; // new Int[7];
		String text = new String("헬로우");
		// null은 주소가 없다는 뜻
		s = null;
		arr = null;
		
		String[] texts = null; //실제 배열은 만들어지지 않음
		System.out.println(texts);
		texts = new String[3]; //문자열 배열(3) 생성하여 texts에 주소 값 넣어줌
		System.out.println(texts);
		
		texts[0] = new String("하이");
		texts[1] = new String("Hi");
		texts[2] = new String("Hello");
		System.out.println(texts[0]);
		System.out.println(texts[1]);
		System.out.println(texts[2]);
		
		for (String word : texts) {  // word는 각각의 데이터를 가르킴
			System.out.println(word);
		}
	}
}
