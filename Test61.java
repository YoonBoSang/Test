package Test;

import java.util.*;

public class Test61 {
	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		if(arr.length - 1 == 0) {
			int[] answer = {-1};
//			return answer;
		}
		int[] answer = new int[arr.length - 1];
		int min = Integer.MAX_VALUE;
		int j = 0;
		for (int i = 0; i < answer.length; i++) {
			min = min > Math.min(arr[i], arr[i + 1]) ? Math.min(arr[i], arr[i + 1]) : min;
		}
		for (int i : arr) {
			if (i == min) {
				continue;
			}
			answer[j++] = i;
		}
		System.out.println(Arrays.toString(answer));
	}
}
