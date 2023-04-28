package Test;

import java.util.*;

public class Test108 {
	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		int j = 0;
        String answer = "";
        String[] arr = new String[my_string.length()/m];
        for(int i = 0; i < my_string.length(); i = i + m) {
            arr[j++] = my_string.substring(i, i + m);
        }
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i].charAt(c - 1);
        }
		System.out.println(answer);
	}
}
