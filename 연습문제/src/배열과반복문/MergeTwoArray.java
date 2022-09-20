package 배열과반복문;

public class MergeTwoArray {

	public static void main(String[] args) {
		int[] evens = { 0, 2, 4, 6, 8 };
		int[] odds = { 1, 3, 5, 7, 9 };

		int[] result = merge(evens, odds);

		System.out.printf("결과 : ");
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%d ", result[i]);
		}
	}

	// 두 배열을 입력 받아 하나로 된 새 배열을 반환
	public static int[] merge(int[] arr1, int[] arr2) {
		int[] merge = new int[arr1.length + arr2.length]; // 배열의 크기

		for (int i = 0; i < arr1.length; i++) {
			merge[i*2] = arr1[i];
			merge[i*2+1] = arr2[i];
		}

		return merge;
	}
}
