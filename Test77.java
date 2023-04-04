package Test;

import java.util.*;

public class Test77 {
	public static void main(String[] args) {
		int N = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		int[] answer = new int[N];
		double[] arr = new double[stages.length];
		List<Double> arr2 = new ArrayList<>();
		int lastcnt = 0;
		Arrays.sort(stages);
		for (int i = 0; i < stages.length; i++) {
			int cnt = 0;
			if (i + 1 != stages.length && stages[i] == stages[i + 1]) {
				continue;
			}
			for (int j = 0; j < stages.length; j++) {
				if (stages[i] == stages[j]) {
					cnt++;
				}
			}

			System.out.println(cnt);
			System.out.println(stages.length - lastcnt);
			System.out.println("---------------------------");

			arr[i] = cnt / (double) (stages.length - lastcnt);

			lastcnt += cnt;
		}
		System.out.println(Arrays.toString(arr));
		for (double i : arr) {
			arr2.add(i);
		}
		System.out.println(arr2);
		Collections.sort(arr2);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; i < arr2.size(); j++) {
				if (arr2.get(i) == arr[j]) {
					answer[i] = j;
					arr2.remove(i);
					break;
				}
			}
		}
	}
}
