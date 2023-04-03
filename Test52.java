package Test;

import java.util.*;

public class Test52 {
	public static void main(String[] args) {
		int n = 4;
		int[] numlist = { 1, 2, 3, 4, 5, 6 };
		int[] arr = new int[numlist.length];
		int z = 0;
		List<Integer> list1 = new ArrayList<>();
		for (int i : numlist) {
			list1.add(i);
		}
		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if (Math.abs(n - list1.get(i)) < Math.abs(n - list1.get(j))) {
					int temp = list1.get(i);
					list1.set(i, list1.get(j));
					list1.set(j, temp);
				}
				if (Math.abs(n - list1.get(i)) == Math.abs(n - list1.get(j))) {
					int k = Math.max(list1.get(i), list1.get(j));
					int h = Math.min(list1.get(i), list1.get(j));
					list1.set(i, h);
					list1.set(j, k);
				}
			}
		}
		for (int i : list1) {
			arr[z] = i;
			z++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
