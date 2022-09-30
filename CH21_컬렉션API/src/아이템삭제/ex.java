package 아이템삭제;

public class ex {
	public static void main(String[] args) {
		String city = "북경";
		String contury = "";
		switch (city) {
		case "서울" :
		case "부산" : contury = "한국";
		case "북경" : contury = "중국"; break;
		case "동경" : contury = "일본"; break;
		default : contury = "대상없음";
		}
		System.out.println(contury);
	}
	
	
}
