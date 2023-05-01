package Test;

import java.util.*;

public class Test109 {
	public static void main(String[] args) {
		int[] slicer = {3, 5, 2};
		int[] num_list = {1, 2, 3, 4, 7, 8, 9};
		int n = 2;
        int[] answer = {};
        int j = 0;
        if(n == 1) {
            answer = new int[slicer[1]+1];
            for(int i = 0; i <= slicer[1]; i++) {
                answer[i] = num_list[i];
            }
        } else if (n == 2) {
            answer = new int[num_list.length - slicer[0]];
            for(int i = slicer[0]; i < num_list.length; i++) {
                answer[j++] = num_list[i];
            }
        } else if (n == 3) {
            answer = new int[slicer[1] - slicer[0] + 1];
            for(int i = slicer[0]; i <= slicer[1]; i++) {
                answer[j++] = num_list[i];
            }
        } else {
            answer = new int[(slicer[1] - slicer[0]) / slicer[2] + 1];
            for(int i = slicer[0]; i <= slicer[1]; i++) {
                answer[j++] = num_list[i];
            }
        }
        System.out.println(Arrays.toString(answer));
	}
}
