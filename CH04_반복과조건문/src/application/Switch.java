package application;

public class Switch {

	public static void main(String[] args) {
		// Switch 문은 if else 문 대체 가능
		
		int option = 5; // 언급한 case 변수값 부터 반환 시작
		
		switch(option) {
		case 0 :
			System.out.println("옵션 0 선택.");
			break; //종료
		case 1 :
			System.out.println("옵션 1 선택.");
			break; 
		case 10 :
			System.out.println("옵션 10 선택.");
			break; 
		default:
			System.out.println("없는 옵션입니다.");
			break;
		}
	}
}