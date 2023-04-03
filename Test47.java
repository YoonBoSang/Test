package Test;

import java.util.*;

public class Test47 {
	public static void main(String[] args) {
		String A = "hello";
		String B = "ohell";
		int answer = 0;
		String temp = "";
		for (int j = 0; j < A.length(); j++) {
			String[] arr = A.split("");
			for (int i = 0; i < A.length(); i++) {
				if (i == 0) {
					temp = arr[arr.length - 1];
				} else {
					arr[arr.length - i] = arr[arr.length - i - 1];
				}
				if (i == arr.length - 1) {
					arr[0] = temp;
					A = "";
					answer++;
					for (String k : arr) {
						A += k;
					}
				}
			}
			if (A.equals(B)) {
				break;
			}
		}
		System.out.println(-1);
	}
}