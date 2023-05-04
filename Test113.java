package Test;

import java.util.*;

public class Test113 {
	public static void main(String[] args) {
		int[] rank = {3, 7, 2, 5, 4, 6, 1};
		boolean[] attendance = {false, true, true, true, true, false, false};
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < rank.length; i++) {
            if(attendance[i] == true) {
                list.add(rank[i]);
                list2.add(i);
                System.out.println(rank[i]);
            }
        }
        for(int i = 0; i < list.size(); i++) {
        	for(int j = i; j < list.size(); j++) {
        		if(list.get(i) > list.get(j)) {
        			int temp = list.get(i);
        			list.set(i, list.get(j));
        			list.set(j, temp);
        			
        			int temp2 = list2.get(i);
        			list2.set(i, list2.get(j));
        			list2.set(j, temp2);
        		}
        	}
        }
        answer = list2.get(0) * 10000 + list2.get(1) * 100 + list2.get(2);
//        return answer;
        System.out.println(answer);
	}
}
