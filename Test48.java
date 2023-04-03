package Test;

import java.util.*;

public class Test48 {
	public static void main(String[] args) {
		int n = 40;
		int answer = n + n / 3;
		int sum = 0;
		List<Integer> list1 = new ArrayList();
		List<Integer> list2 = new ArrayList();
		List<Integer> list3 = new ArrayList();
		for(int i = 0; i < 200; i++) {
			list1.add(i);
		}
		for (int i = 13; i < 200; i += 10) {
			list2.add(i);
		}
		for (int i = 30; i < 40; i++) {
			list3.add(i);
		}
		for (int i = 130; i < 140; i++) {
			list3.add(i);
		}
		
		list1.removeIf(e -> e % 3 == 0);
		list1.removeIf(list2::contains);
		list1.removeIf(list3::contains);

		System.out.println(list1.get(n-1));
		int a = list1.get(n);
		// list 써서 풀기
	}
}
