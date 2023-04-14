package Test;

import java.util.*;

public class Test93 {
	public static void main(String[] args) {
		String s = "3people   unFollowed      me";
        String answer = "";
        int i = 0;
        
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));
        for(String str : arr) {
        	if(str.equals(" ")) {
        		
        	}
            arr[i++] = str.substring(0, 1).matches("[a-z]") ? str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase() : str.toLowerCase() ;
        }
        for(String str : arr) {
        	if(str.equals(arr[arr.length-1])) {
        		answer += str;
        	} else {
        		answer += str + " ";
        	}
        }
        System.out.println(answer);
	}
}
