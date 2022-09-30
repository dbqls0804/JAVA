package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collection;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>(); // Double 실수형
		double total = 0;

		while (true) {
			System.out.print("숫자 또는 'q' 입력 > ");
			String input = scanner.nextLine().trim();
			if (input.equalsIgnoreCase("q"))
				break; // q나 Q를 적으면 종료

			try {
				// 입력된 숫자를 Double 타입으로 변환
				double value = Double.parseDouble(input);
				numbers.add(value); // 숫자가 맞으면 리스트에 입력
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}
		}

		System.out.println();
		if (numbers.isEmpty()) { // 비었으면 true 반환! numbers.size() > 0 도 가능
			System.out.println("입력된 숫자가 없습니다.");
		} else {
			System.out.println("입력된 숫자 : ");
			for (Double n : numbers) {
				System.out.printf("%.2f\n", n);
				total += n;
			}
			double avg = total / (numbers.size());
			System.out.printf("평균값 : %.2f", avg);
		}

	}

}
