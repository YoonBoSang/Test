package Test;

import java.util.*;

public class Test91 {
	public static void main(String[] args) {
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		int[] choices = {5, 3, 2, 7, 5};
		Map<String, Integer> map = Map.of("R", 0, "T", 0, "C", 0, "F", 0, "J", 0, "M", 0, "A", 0, "N", 0);
		Map<String, Integer> map1 = new HashMap<>(map);
		String[] arr1 = {"R", "T", "C", "F", "J", "M", "A", "N"};
		String answer = "";
		for(int i = 0; i < survey.length; i++) {
			String[] arr = survey[i].split("");
			if(choices[i] < 4) {
				int j = choices[i] == 1 ? 3 : (choices[i] == 2 ? 2 : 1);
				map1.replace(arr[0], map1.get(arr[0]) + j);
			} else if (choices[i] == 4) {
				continue;
			} else {
				int j = choices[i] == 5 ? 1 : (choices[i] == 6 ? 2 : 3);
				map1.replace(arr[1], map1.get(arr[1]) + j);
			}
		}
		for(int i = 0; i < 8; i = i + 2) {
			if(map1.get(arr1[i]) > map1.get(arr1[i + 1])) {
				answer += arr1[i];
			} else if (map1.get(arr1[i]) < map1.get(arr1[i + 1])) {
				answer += arr1[i + 1];
			} else {
				answer += arr1[i].charAt(0) < arr1[i + 1].charAt(0) ? arr1[i] : arr1[i + 1];
			}
		}
		System.out.println(answer);
	}
}
