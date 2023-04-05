package Test;

import java.util.*;

public class Test82 {
	public static void main(String[] args) {
		int n = 8;
		int m = 4;
		int answer = 0;
		int[] section = { 2, 3, 6 };
		List<Integer> list = new ArrayList<>();
		for (int j = 0; j < section.length; j++) {
			if (!list.contains(section[j])) {
				answer++;
				for (int i = section[j]; i < section[j] + m; i++) {
					list.add(i);
				}
			}
		}
	}
}
