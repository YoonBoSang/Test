package Test;

import java.util.*;

public class Test62 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
        int a = 0;
        int cnt = 0;
        int k = 0;
        int j = 1;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(j == arr.length) {
                if(arr[i] == arr[j - 1]) {
                    list.add(arr[i]);
                    break;
                } else {
                    list.add(arr[j - 1]);
                    list.add(arr[i]);
                    break;
                }
            }
            
            System.out.println("i:" + i);
            System.out.println("cnt:" + cnt);
            System.out.println("j:" + j);
            System.out.println("-------------");
            if(arr[i] == arr[j]) {
                cnt++;
                j++;
                i--;
            } else {
//            	System.out.println(arr[i]);
                list.add(arr[i]);
                i = i + cnt;
                j = i + 2;
                cnt = 0;
            }
                
        }
        
        int[] answer = new int[list.size()];
        for(int i : list) {
            answer[k++] = i;
        }
        System.out.println(Arrays.toString(answer));
	}
	
}
