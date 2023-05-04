package Test;

import java.util.*;

public class Test112 {
	public static void main(String[] args) {
		String[] picture = {".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...."};
		int k = 2;
		int a = 0;
        String[] answer = new String[picture.length*k];
        for(int i = 0; i < picture.length*k; i = i + k) {
            String[] arr = picture[a++].split("");
            System.out.println(Arrays.toString(arr));
            for(int j = 0; j < arr.length; j++) {
                for(int l = 0; l < k; l++) {
                    answer[i] += arr[j];
                    answer[i] = answer[i].replace("null", "");
                }
                for(int l = i + 1; l < i+k; l++) {
                	answer[l] = answer[i];
                }
            }
        }
        System.out.println(Arrays.toString(answer));
	}
}
