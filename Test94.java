package Test;

import java.util.*;

public class Test94 {
	public static void main(String[] args) {
		int n = 5;
        int[] arr = new int[n + 1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        arr[1] = 0;
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            if(arr[i] == 0) {
                continue;
            } else {
                for(int j = 2 * i; j <= n; j += i) {
                    arr[j] = 0;
                }
            }
        }
        for(int i : arr) {
            if(i != 0) {
                answer++;
            }
        }
	}
}
