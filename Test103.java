package Test;

import java.util.*;

public class Test103 {
	public static void main(String[] args) {
		int N = 6;
		int[] stages = { 3, 3, 3, 5, 3, 3, 2, 1, 1, 6 };
		int[] answer = new int[N];
		int[] arr = new int[N];
		double p = stages.length;
		String[] strArr = new String[N];
		String[] strArr2 = new String[N];
		for (int i : stages) {
			if (i == N + 1) {
				continue;
			}
			arr[i - 1]++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] / p == 0) {
				strArr[i] = "0";
				continue;
			}
			if (p == 0) {
				strArr[i] = "0";
				continue;
			}
			strArr[i] = Double.toString(arr[i] / p);
			p = p - arr[i];
		}
		for (int i = 0; i < strArr.length; i++) {
			strArr2[i] = strArr[i];
		}
		Arrays.sort(strArr2, Collections.reverseOrder());
		System.out.println(Arrays.toString(strArr2));
		for (int i = 0; i < strArr2.length; i++) {
			for (int j = 0; j < strArr.length; j++) {
				if (strArr2[i].equals(strArr[j])) {
					answer[i] = j + 1;
					strArr[j] = "";
					break;
				}
			}
		}
	}
}
