package Test;

import java.util.*;

public class Test80 {
	public static void main(String[] args) {
		String str = "10D4S10D";
		String[] arr = str.split("");
		String[] arr2 = new String[3];
		int k = 0;
		int answer = 0;
		int sum = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("S") || arr[i].equals("D") || arr[i].equals("T")) {
				if(i + 1 != arr.length && (arr[i + 1].equals("*") || arr[i + 1].equals("#"))) {
					arr2[k++] = arr[i - 1] + arr[i] + arr[i + 1];
				} else if(i - 2 >= 0 && arr[i -2].matches("[0-9]")){
					arr2[k++] = arr[i - 2] + arr[i - 1] + arr[i];
				} else {
					arr2[k++] = arr[i - 1] + arr[i];
				}
			}
		}
		for(int i = arr2.length - 1; i >= 0; i--) {
			if(arr2[i].contains("*")) {
				arr2[i] = arr2[i].replace("*", " 2");
				if(i - 1 >= 0 ) {
					arr2[i - 1] += " 2";
				}
			} else if(arr2[i].contains("#")) {
				arr2[i] = arr2[i].replace("#", " -1");
			}
			if(arr2[i].contains("S")) {
				arr2[i] = arr2[i].replace("S", "");
			} else if(arr2[i].contains("D")) {
				arr2[i] = arr2[i].replace("D", " " + arr2[i].substring(0, arr2[i].indexOf("D")));
			} else if(arr2[i].contains("T")) {
				arr2[i] = arr2[i].replace("T", " " + arr2[i].substring(0, arr2[i].indexOf("T")) + " " + arr2[i].substring(0, arr2[i].indexOf("T")));
			}
		}
		for(String a : arr2) {
			String[] arr3 = a.split(" ");
			for(String b : arr3) {
				sum *= Integer.parseInt(b);
			}
			answer += sum;
			sum = 1;
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println(answer);
	}
}
