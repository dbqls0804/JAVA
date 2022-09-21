package application;

public class RegexPractice {

	public static void main(String[] args) {
		// 1. 문자열.matches(regex)
		System.out.println("Cat".matches("cat")); // 문자열이 매칭되는가?
		System.out.println("Cat".matches("Cat")); // 대소문자 구분됨
		System.out.println("Cat".matches("[ABC]at")); 
		// []안에 있는 문자 중 하나라도 일치하면 true
		System.out.println("Cat".matches("[a-zA-z]at")); 
		// []안에 있는 문자 중 하나라도 일치하면 true(소문자, 대문자 전부 포함)
		System.out.println("CAT".toLowerCase().matches("cat"));
		// toLowerCase => 소문자로 변환
		
		/* 1-1. 전화번호 형식이 맞는지 체크 (010)-\\d{3,4}-\\d{4}
		   => { }안에 숫자가 3개 또는 4개란 뜻, \\d 는 자바에서 한개의 숫자 가르킬 때 */
		boolean check = "010-123456-1234".matches("(010)-\\d{3,6}-\\d{4}");
		System.out.println("전화번호 체크 : " + check);
		
		/* 1-2. 이메일 형식 체크 \w+@\w+\.\w+
		   => \\w 는 자바에서 한 개의 알파벳 또는 한개의 숫자  */
		check = "ckdbqls0804@naver.com".matches("\\w+@\\w+\\.\\w+");
		System.out.println("이메일 체크 : " + check);
	}

}
