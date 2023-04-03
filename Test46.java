package Test;

import java.util.*;

public class Test46 {
	public static void main(String[] args) {
		int[] numlist = {10000,20,36,47,40,6,10,7000};
		int n = 30;
		int[] arr = new int[numlist.length];
		int j = 0;
		Arrays.sort(numlist);
		for(int i = 0; i < numlist.length; i++) {
			if(numlist[i] < n) {
				numlist[i] = n - numlist[i];
				arr[j] = i;
				j++;
			} else {
				numlist[i] = numlist[i] - n;
			}
		}
		j = 0;
		Arrays.sort(numlist); // 이거 못빼나?
		for(int i = 0; i < numlist.length; i++) {
			if(i == arr[j]) {
				numlist[i] = n - numlist[i];
				j++;
			}
			numlist[i] += n;
		}
	}
}
