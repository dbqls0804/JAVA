package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// 예제 1	
		
		System.out.println("메뉴 \n====\n");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료\n");
		System.out.printf("옵션을 선택 > ");
		
		Scanner scanner = new Scanner(System.in); //scanner를 부르기 전에 언급
		int a = scanner.nextInt();
		
	/*	if (a==1) {
			System.out.println("헬로우");
		}
		else if(a==2) {
			System.out.println("안녕 ?");
		}
		else if(a==3) {
			System.out.println("프로그램 종료");
		}
		else if(a==10000) {
			System.out.println("이스터에그를 발견했습니다.");
		}
		else {
			System.out.println("잘못된 옵션입니다.");
		} */
		
		// switch문으로 바꾸기
		switch(a) {
		case 1 :
			System.out.println("헬로우");
			break; //종료
		case 2 :
			System.out.println("안녕 ?");
			break; 
		case 3 :
			System.out.println("프로그램 종료");
			break;
		case 10000 :
			System.out.println("이스터에그를 발견했습니다.");
			break; 
		default:
			System.out.println("잘못된 옵션입니다.");
			break;
		}
	}
}
