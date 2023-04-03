package Test;

import java.util.*;

public class Test64 {
	public static void main(String[] args) {
		String s = 	"      abab    AAA    AccC      ";
        String answer = "";
        int CNT = 0;
        while(s.startsWith(" ")) {
        	s = s.replaceFirst(" ", "");
        	answer += " ";
        }
		String[] arr = s.split("");
		for (String str : arr) {
			if (!str.equals(" ")) {
				CNT++;
			} else if (str.equals(" ")) {
				CNT = 0;
			}
			for (int i = 0; i < str.length(); i++) {
				if (CNT % 2 != 0) {
					answer += str.substring(i, i + 1).toUpperCase();
				} else {
					answer += str.substring(i, i + 1).toLowerCase();
				}
			}
		}
	}
}
