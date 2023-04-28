package Test;

import java.util.*;

public class Test106 {
	public static void main(String[] args) {
		int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
		int k = 6;
		int sum = 0;
		int j = 1;
		int answer = 0;
		Arrays.sort(tangerine);
		List<Integer> list = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < tangerine[tangerine.length - 1]; i++) {
			list.add(0);
		}
		for(int i : tangerine) {
			list.set(i - 1, list.get(i - 1) + 1);
		}
		Collections.sort(list);
		while(sum < k) {
			sum += list.get(list.size() - j++);
			answer++;
		}
		
		System.out.println(list);
		System.out.println(answer);
		
	}
}
