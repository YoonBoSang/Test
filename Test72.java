package Test;

import java.util.*;

public class Test72 {
	public static void main(String[] args) {
		String s = "2three45sixseven";
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numarr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for(int i = 0; i < arr.length; i++) {    
            if(s.contains(arr[i])) {
                s = s.replace(arr[i], numarr[i]);
            }
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
	}
}
