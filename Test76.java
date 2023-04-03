package Test;

import java.util.*;

public class Test76 {
	public static void main(String[] args) {
		int[] answers = {1, 2, 3, 4, 5, 2, 4, 3, 5, 1, 3, 4, 5, 2, 4, 3, 4, 5, 5, 5 };
        int k = 1;
        int b = 1;
        int[] arr1 = new int[answers.length];
        int[] arr2 = new int[answers.length];
        int[] arr3 = new int[answers.length];
        List<Integer> list = new ArrayList<>();
        int[] arr4 = {3,3,1,1,2,2,4,4,5,5};
        int a = 0;
        int c = 0;
        int A = 0;
        int B = 0;
        int C = 0;
        for(int i = 0; i < answers.length; i++) {
            arr1[i] = k++;
            k = k > 5 ? 1 : k;
            b = b != 2 ? b : 3;
            arr2[i] = i % 2 == 0 ? 2 : b++;
            b = b > 5 ? 1 : b;
            arr3[i] = arr4[c++];
            c = c > 9 ? 0 : c;
        }
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i]) {
                A++;
            }
            if(answers[i] == arr2[i]) {
                B++;
            }
            if(answers[i] == arr3[i]) {
                C++;
            }
        }
        int max = Math.max((int)A, (int)B);
        max = Math.max(max, (int)C);
        if(max == (int)A) {
            list.add(1);
        }
        if(max == (int)B) {
            list.add(2);
        }
        if(max == (int)C) {
            list.add(3);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++ ) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        Arrays.sort(answer);
		
	}
}
