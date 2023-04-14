package Test;

import java.util.*;

public class Test92 {
	public static void main(String[] args) {
		String today = "2020.01.01";
		String[] terms = {"Z 3", "D 5"};
		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
        String a = "";
        today = today.replace(".", "");
        for(int i = 0; i < privacies.length; i++) {
            String[] arr = privacies[i].replace(" ", ".").split("\\.");
            String S = privacies[i].replace(" ", ".");
            for(int j = 0; j < terms.length; j++) {
                if(terms[j].contains(arr[3])) {
                    arr[1] = Integer.parseInt(arr[1]) + Integer.parseInt(terms[j].replace(arr[3]+ " ", "")) + "";
                    if(arr[1].length() < 2) {
                    	arr[1] = "0" + arr[1];
                    }
                    if(12 < Integer.parseInt(arr[1])) {
                        arr[0] = Integer.parseInt(arr[0]) + 1 + "";
                        arr[1] = "0" + (Integer.parseInt(arr[1]) - 12);
                    }
                    System.out.println(Integer.parseInt(arr[0] + arr[1] + arr[2]));
                    if(Integer.parseInt(arr[0] + arr[1] + arr[2]) < Integer.parseInt(today)) {
                        a += "" + (i + 1);  
                    }
                }
            }
            
        }
        int[] answer = new int[a.length()];
        String[] A = a.split("");
        for(int i = 0; i < A.length; i++) {
            answer[i] = Integer.parseInt(A[i]);   
        }
        System.out.println(Arrays.toString(answer));
	}
}
