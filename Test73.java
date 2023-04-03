package Test;

import java.util.*;

public class Test73 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 60, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			List<Integer> list = new ArrayList<>();
			for(int j = commands[i][0] - 1; j < commands[i][1]; j++ ) {
				list.add(array[j]);
				}
			Collections.sort(list);
			answer[i] = list.get(commands[i][2]-1);
		}
		System.out.println(Arrays.toString(answer));
	}
}
