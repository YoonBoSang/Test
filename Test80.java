package Test;

import java.util.*;

public class Test80 {
	public static void main(String[] args) {
		String str = "1D#2S*3S";
		str.replaceAll("#", "-1");
		String[] arr = str.split("");
		String[] arr2 = new String[3];
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("S") || arr[i].equals("D") || arr[i].equals("T")) {
				if(i + 1 != arr.length && (arr[i + 1].equals("*") || arr[i + 1].equals("#"))) {
					arr2[k++] = arr[i - 1] + arr[i] + arr[i + 1];
				} else {
					arr2[k++] = arr[i - 1] + arr[i];
				}
			}
		}
		for(int i = arr2.length - 1; i >= 0; i--) {
			if(arr2[i].contains("*")) {
				arr2[i] = arr2[i].replace("*", "2");
				if(i - 1 >= 0 ) {
					arr2[i - 1] += "2";
				}
			} else if(arr2[i].contains("#")) {
				arr2[i] = arr2[i].replace("#", "-1");
			}
			if(arr2[i].contains("S")) {
				arr2[i] = arr2[i].replace("S", "");
			}
		}
		System.out.println(Arrays.toString(arr2));
	}
}
