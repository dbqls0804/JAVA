package application;

public class Stringequals {

	public static void main(String[] args) {
		// 문자열을 비교할 때 사용하는 메소드
		String s1 = "apple";
		String s2 = "orange";
		String s3 = new String("apple"); 
		// class 타입 객체를 만들 때 new String("변수")로 생성해야함
		// 문자열 비교는 equals 메소드를 사용해야함
		
		System.out.println(s3);
		
		System.out.printf("두개의 문자열 일지 : %b \n", s1==s3);
		System.out.println("두개의 문자열 일지 : " + s1.equals(s3));
	}
}
