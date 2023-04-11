package Test;

import java.util.*;

public class Test89 {
	public static void main(String[] args) {
		String new_id = "...!@BaT#*..y.abcdefghijklm";
        String answer = "";
        int cnt = 0;
        new_id = new_id.toLowerCase();
        List<String> list = new ArrayList<>();
        if(new_id.equals("")){
//            return "aaa";
        }
        if(new_id.length() <= 2){
            for(int i = new_id.length(); i < 3; i++) {
                new_id += new_id.charAt(new_id.length() - 1);
            }
//            return new_id;
        }
        for(String s : new_id.split("")) {
            if(s.matches("[0-9]") || s.matches("[a-z]") || s.matches("-") || s.matches("_") || s.matches("\\.")) {
                if((cnt == 0 || cnt == s.length() - 1) && s.equals(".")){
                    continue;
                } else if (s.equals(".") && list.get(cnt-1).equals(".")) {
                    continue;
                }
                list.add(s); 
                cnt++;
            }
        }
        if(list.size() >= 16) {
        	if(list.get(15).equals(".")) {
        		for(int i = 0; i <= 15; i++ ) {
        			answer += list.get(i);
        		}
        	} else {
        		for(int i = 0; i < 15; i++ ) {
        			answer += list.get(i);
        		}
        	}
        } else {
        	for(int i = 0; i < list.size(); i++ ) {
        		answer += list.get(i);
        	}
        }
        
        System.out.println(answer);
        System.out.println("!".matches("."));
	}
}
