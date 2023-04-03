package Test;

import java.util.*;

public class Test30 {
	public static void main(String[] args) {
//		int[] num1 = {15, 2, 3, 5, 6};
//		int[] num2 = num1;
//		num2[1] = 11;
//		int[] num3 = new int[num1.length];
//		System.out.println(num1[1]);
//		for (int i = 0; i < num1.length; i++ ) {
//			num3[i] = num1[i];
//		}
//		System.out.println(num3[1]);
//		num3[1] = 10;
//		System.out.println(num1[1]);
//		System.out.println(num3[1]);
		int[] emergency = {3, 1, 2};
        int[] answer = new int[emergency.length];
        int[] arr = new int[emergency.length];
        int sum = emergency.length; 		
        for (int i = 0; i < emergency.length; i++ ) {
			answer[i] = emergency[i];
		}
        Arrays.sort(emergency);
        System.out.println(answer[5]);
        System.out.println(emergency[0]);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer.length; j++) {
                if(emergency[i] == answer[j]) {
                    arr[j] = sum; // 가장 큰값 에서 -- 하기
                    sum--; 
                } 
            }
        }
        System.out.println(arr[5]);
		
	}
}
