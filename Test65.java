package Test;

import java.util.*;

public class Test65 {
	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
        int answer = 0;
        Arrays.sort(d);
        for(int i : d) {
            if(budget - i >= 0) {
                budget = budget - i;
                answer++;
            }
        }
	}
}
