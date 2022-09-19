package application;

public class MultiArray2 {

	public static void main(String[] args) {
		// 이중배열
		int[][] numbers = { 
				{ 1,5,7 }, 
				{ 9,6,3 }, 
				{ 2,4,6 }
				};
		
		int total = 0;

		for (int i = 0; i < numbers.length; i++) {
			
			for (int j = 0; j < numbers.length; j++) {
				total = total + numbers[i][j];
				/* i= 0 일때, j=0, j=1, j=2 순으로 불러옴 (1, 5, 7 순)
				   i= 1 일때, j=0, j=1, j=2 순으로 불러옴 (9, 6, 3 순)
				   i= 2 일때, j=0, j=1, j=2 순으로 불러옴 (2, 4, 6 순)*/
			}
		}
		System.out.println("총합은 : " + total);
	}
}