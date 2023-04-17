package Test;

import java.util.*;

public class Test101 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
        int answer = 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int[] arr = new int[nums[nums.length - 1] + nums[nums.length -2] + nums[nums.length - 3] + 1];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        for(int i = 2; i < arr.length; i++) {
            if(arr[i] == 0){
                continue;
            } else {
                for(int j = 2 * i; j < arr.length; j = j + i) {
                    arr[j] = 0;
                }
            }
        }
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    set.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }
        for(int i : arr) {
            if(i != 0) {
                list.add(i);
            }
        }
        for(int i : set) {
            if(list.contains(i)) {
                answer++;
            }
        }
        System.out.println(answer);
	}
}
