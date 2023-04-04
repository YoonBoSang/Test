package Test;

import java.util.*;

public class Test78 {
	public static void main(String[] args) {
		int N = 4;
		int[] stages = {4, 4, 4, 4, 4};
		int k = 0;
        int[] answer = new int[N];
        double[] arr = new double[N];
        int lastcnt = 0;
        Arrays.sort(stages);
        for(int i = 0; i < stages.length; i++) {
            int cnt = 0;
            if(i + 1 != stages.length && stages[i] == stages[i + 1]) {
            	continue;
            }
            for(int j = 0; j < stages.length; j++) {
                	if(stages[i] != N + 1 && stages[i] == stages[j]) {
                		cnt++;
                }
            }
            
            System.out.println(cnt);
            System.out.println(stages.length - lastcnt);
            System.out.println("---------------------------");
            
          	arr[stages[i] - 1] = cnt / (double)(stages.length - lastcnt);
            
            lastcnt += cnt;
        }
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < N; i++) {
        	answer[i] = i + 1;
        }
        for(int i = 0; i < arr.length; i++) {
        	for(int j = i + 1; j < arr.length; j++) {
        		if(arr[i] < arr[j]) {
        			double temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        			int temp1 = answer[i];
        			answer[i] = answer[j];
        			answer[j] = temp1;
        		} 
        	}
        	
        }
        System.out.println(Arrays.toString(answer));
	}
}
