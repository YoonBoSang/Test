package Test;

import java.util.*;

public class Test110 {
	public static void main(String[] args) {
		String[] strArr = {"a","bc","d","efg","hi", "c"};
		List<Integer> list = new ArrayList<>();
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>(); 
        for(String s : strArr) {
        	if(!map.containsKey(s.length())) {
        		map.put(s.length(), 1);
        		list.add(s.length());
        	} else {
        		map.replace(s.length(), map.get(s.length()) + 1);
        	}
        }
        int max = Integer.MIN_VALUE;
        for(int i : list) {
        	max = map.get(i) > max ? map.get(i) : max;
        }
        String[] arr = strArr;
        System.out.println(max);
        System.out.println(0 % 2);
	}
}
