package Test;

import java.util.*;

public class Test84 {
	public static void main(String[] args) {
		String X = "1000000";
		String Y = "12345000";
		String answer = "";
		String s = "";
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		int max = Math.max(X.length(), Y.length());
		int min = Math.min(X.length(), Y.length());
		for (int i = 0; i < min; i++) {
			if (Y.contains(String.valueOf(X.charAt(i)))) {
				cnt++;
				list.add(X.charAt(i) - '0');
				Y = Y.replaceFirst("" + X.charAt(i), "");
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		for (int i : list) {
				answer += i + "";
		}
		if (cnt == 0) {
//            return "-1";
		} else if (answer.replace("0", "").equals("")) {
//			return "0";
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
