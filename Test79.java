package Test;

import java.util.*;

public class Test79 {
	public static void main(String[] args) {
		int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
		int k = 4;
        int[] answer = new int[score.length];
        int x = 1;
        for(int i = 0; i < score.length; i++) {
            int[] arr = new int[i + 1];
            for(int j = 0; j <= i; j++) {
                arr[j] = score[j];
            }
            Arrays.sort(arr);
            if(i < k) {   
                answer[i] = arr[0];
            } else {
                answer[i] = arr[x++];
            }
        }
        System.out.println(Arrays.toString(answer));
	}
}
