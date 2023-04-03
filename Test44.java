package Test;

import java.util.*;

public class Test44 {
	public static void main(String[] args) {
		int[][] score = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 }, { 110, 90 }, {120, 80}};
		int[] answer = new int[score.length];
		int[][] arr = new int[score.length][2];
		int[][] arr1 = new int[score.length][2];
		for (int i = 0; i < score.length; i++) {
			arr[i][1] = i;
			arr[i][0] = score[i][0] + score[i][1];
		}
		for (int i = 0; i < score.length; i++) {
			arr1[i][1] = i;
			arr1[i][0] = score[i][0] + score[i][1];
		}
		for (int i = 0; i < score.length; i++) {
			for (int j = i; j < score.length; j++) {
				if (arr[i][0] < arr[j][0] && i != j) {
					answer[0] = arr[i][0];
					arr[i][0] = arr[j][0];
					arr[j][0] = answer[0];
					answer[1] = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = answer[1];
//                    System.out.println(arr[j][1]);
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			answer[arr[i][1]] = i;

		}
		for (int i = 0; i < score.length; i++) {
			arr1[i][1] = answer[i];
		}
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i][0] == arr1[j][0]) {
					if(arr1[i][1] > arr1[j][1]) {
						arr1[i][1] = arr1[j][1];
					} else if (arr1[i][1] < arr1[j][1]){
						arr1[j][1] = arr1[i][1];
					}
				}
			}
		}
		for (int i = 0; i < score.length; i++) {
			answer[i] = arr1[i][1] + 1;
		}
		System.out.println(Arrays.toString(answer));
	}
}
