package Test;

import java.util.*;

public class Test84 {
	public static void main(String[] args) {
		String X = "100";
		String Y = "123450";
		String answer = "";
		String s = "";
		int max = Math.max(X.length(), Y.length());
		int min = Math.min(X.length(), Y.length());
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		if(X.contains("0") && Y.contains("0")) {
			s = "0";
			X = X.replace("0", "");
			Y = Y.replace("0", "");
			cnt++;
		}
		System.out.println(X);
		System.out.println(Y);
		for (int i = 0; i < min; i++) {
			if (i < X.length() && Y.contains(String.valueOf(X.charAt(i)))) {
				cnt++;
				list.add(X.charAt(i) - '0');
				Y = Y.replaceFirst("" + X.charAt(i), "");
			}
		}
		if (cnt == 0) {
//            return "-1";
			System.out.println(-1);
		}
		Collections.sort(list, Collections.reverseOrder());
		for (int i : list) {

				answer += i + "";
		}
		
		System.out.println(answer + s);
//        int[] arr = new int[list.size()];
//        for(int i = 0; i < list.size(); i++) {
//        	arr[i] = list.get(i);
//        }
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] < arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for(int i : arr) {
//        	if(i == 0) {
//        		s = "0";
//        	} else {
//        		answer += i + "";
//        	}
//        }
//        answer += s;
//        System.out.println(answer);
	}
}
