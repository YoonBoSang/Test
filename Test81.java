package Test;

import java.util.*;

public class Test81 {
	public static void main(String[] args) {
		int[] lottos = {1,2,3,4,5,6 };
		int[] win_nums = { 7,8,9,10,11,12 };
		String str = "";
		int cnt = 0;
		int cnt1 = 0;
		int cnt2 = 0;
		for (int i : lottos) {
			str += " " + i;
		}
		for (int i : win_nums) {
			for (int j : lottos) {
				if (i == j) {
					cnt++;
					cnt1++;
				}
			}
			if (cnt == 0 && str.contains(" 0")) {
				str = str.replaceFirst(" 0", " " + i);
				cnt2++;
			}
			cnt = 0;
		}
		if(!str.contains("0") && cnt1 == 0) {
			int[] answer = { 6, 6};
		}
		for (int i = 1; i <= 6; i++) {
			if (i == cnt1) {
				cnt1 = 7 - i;
				break;
			} else if (cnt1 == 0) {
				cnt1 = 6;
				cnt2--;
				break;
			}
		}
		System.out.println(cnt2);
		
		int[] answer = { cnt1 - cnt2, cnt1 };
		System.out.println(Arrays.toString(answer));
		System.out.println(str);
	}
}
