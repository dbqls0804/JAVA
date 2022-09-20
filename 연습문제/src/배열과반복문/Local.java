package 배열과반복문;

public class Local {

	public static void main(String[] args) {
		int[] visitors = {599, 51, 46, 43, 27};
		String[] city = {"서울", "부산", "인천", "대전", "대구"};
		
		for (int i = 0; i < city.length; i++) {
			System.out.printf("%s : %d명\n", city[i] , visitors[i]);
		}
	}

}
