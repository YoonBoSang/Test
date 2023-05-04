package Test;

import java.math.*;
import java.util.*;

public class Test111 {
	public static void main(String[] args) {
		int[] stk = {};
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.size();
		String a = "18446744073709551615";
		String b = "287346502836570928366";
		int A = a.length();
		int B = b.length();
		String answer = "";
		if(A > B) {
			for(int i = 0; i < A - B; i++) {
				b = "0" + b;
			}
		} else if (A < B) {
			for(int i = 0; i < B - A; i++) {
				a = "0" + a;
			}
		}
		String[] arr1 = a.split("");
		String[] arr2 = b.split("");
		String[] arr3 = new String[a.length()];
		for(int i = 0; i < arr1.length; i++) {
			arr3[i] = String.valueOf(Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i])); 
		}
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		for(int i = arr3.length - 1; i > 0; i--) {
			System.out.println(arr3[i]);
			System.out.println(arr3[i-1]);
			if(Integer.parseInt(arr3[i]) >= 10) {
				arr3[i - 1] = String.valueOf(Integer.parseInt(arr3[i]) + Integer.parseInt(arr3[i])/10);
				arr3[i] = String.valueOf(Integer.parseInt(arr3[i])/10);
				System.out.println("--------------------------------");
				
			}
		}
		for(String s : arr3) {
			answer += s;
		}
		System.out.println(answer);
	}
	
}
