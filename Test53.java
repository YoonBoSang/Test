package Test;

import java.util.*;

public class Test53 {
	public static void main(String[] args) {

		int num = 3;
		int total = 15;
		int[] answer = new int[num];
		if(total % num == 0) {
			//나눠진거 양쪽으로 펼치기
			answer[(num - 1)/2] = total/num;
			for(int i = (num-1)/2 + 1; i < num; i++) {
				answer[i] = answer[i - 1] + 1;
			}
			for(int i = (num-1)/2 - 1; i >= 0; i--) {
				answer[i] = answer[i + 1] - 1;
			}
		} else {
//			answer[(num - 1)/2] = total/num;
//			answer[(num - 1)/2 + 1] = total/num + 1;
			
		}
	}
}
