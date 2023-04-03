package Test;

import java.util.*;

public class Test31 {
	public static void main(String[] args) {
		String s = "abdc";
        String answer = "";
        String[] arr = s.split("");
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(arr[i].equals(arr[j]) && i != j) {
                    arr[j] = "";
                    sum++;
                        
                }
            }
            if(sum >= 1) {
                arr[i] = "";
                sum = 0;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
	}
}
