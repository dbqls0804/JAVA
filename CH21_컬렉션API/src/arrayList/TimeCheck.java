package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeOperationsException;

public class TimeCheck {

	public static void main(String[] args) {
		// linkedList vs ArrayList

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		
		long duration = timeOperations(linkedList);
		System.out.println("측정 시간 : " + duration);
	}

	private static long timeOperations(List<Integer> list) {
		// 리스트의 동작시간을 측정한다.
		long start = System.currentTimeMillis(); // 현재 시간(ms)
		// 중간 작업
		for(int i = 0; i < 100000; i++) {
			list.add(0,i);
		}
		// 끝난 시간 - 시작 시간
		return System.currentTimeMillis() - start;
	}

}
