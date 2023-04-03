package Test;

import java.util.*;

public class Test60 {
	public static void main(String[] args) {
		int divisor = 5;
		int[] arr = {5, 10};
        List<Integer> list = new ArrayList<>();
        for(int i : arr) {
            if(i % divisor == 0) {
                list.add(i);
            }	
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i); 
        }
        Arrays.sort(answer);
        boolean a = true;
	}
}
