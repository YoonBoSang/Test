package Test;

import java.util.*;

public class Test50 {
	public static void main(String[] args) {
		String polynomial = "3x + 7 + x";
		String[] arr = polynomial.split(" ");
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		int xsum = 0;
		int sum = 0;
		String answer = "";
		for (String s : arr) {
			if (!s.equals("+")) {
				if (s.contains("x")) {
					s = s.replace("x", "");
					if (s.equals("")) {
						s = "1";
					}
					list1.add(s);
				} else {
					list2.add(s);
				}
			}
		}
		for (String str : list1) {
			int i = Integer.parseInt(str);
			xsum += i;
		}
		for (String str : list2) {
			int i = Integer.parseInt(str);
			sum += i;
		}
		if (xsum > 0 && sum > 0) {
			answer = xsum + "x + " + sum;
		} else if (xsum > 0 && sum < 1) {
			if (xsum != 1) {
			answer = xsum + "x";
			} else {
				answer = "x";
			}
		} else if (xsum < 1 && sum > 0) {
			answer = sum + "";
		} else {
			answer = "0";
		}
	}
}
