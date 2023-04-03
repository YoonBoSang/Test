package Test;

import java.util.*;

public class Test70 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };
		int k = 0;
		String[] answer = new String[n];
		String str1 = "";
		for (int i = 0; i < arr1.length; i++) {
			String[] arr3 = Integer.toString(arr1[i], 2).split("");
			String[] arr4 = Integer.toString(arr2[i], 2).split("");
			List<String> list1 = new ArrayList<>();
			List<String> list2 = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if (n - arr3.length > j) {
					list1.add("0");
				} else {
					list1.add(arr3[k++]);
				}
			}
			k = 0;
//			System.out.println(list1);
			for (int j = 0; j < n; j++) {
				if (n - arr4.length > j) {
					list2.add("0");
				} else {
					list2.add(arr4[k++]);
				}
			}
			k = 0;
//			System.out.println(list2);
//			System.out.println("------------------------");
			for (int j = 0; j < n; j++) {
				if (list1.get(j).equals("1") || list2.get(j).equals("1")) {
					str1 += "#";
				} else {
					str1 += " ";
				}
			}
			answer[i] = str1;
			str1 = "";
		}
		System.out.println(answer[2]);
		System.out.println(Arrays.toString(answer));
	}
}
