package Test;

import java.util.*;

public class Test89 {
	public static void main(String[] args) {
		String new_id = "";
        String answer = "";
        int cnt = 0;
        new_id = new_id.toLowerCase();
        List<String> list = new ArrayList<>();
        if(new_id.equals("")){
//            return "aaa";
        	System.out.println("aaa");
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
        for(int i = 0; i < list.size(); i++) {
        		if((i == 0 || i == list.size() - 1) && list.get(i).equals(".")){
        			list.remove(i);
        		} else if (i - 1 >= 0 && list.get(i).equals(".") && list.get(i-1).equals(".")) {
        			list.remove(i);
        		}
        }
        
        if(list.isEmpty()){
//            return "aaa";
        }
        if(list.size() <= 2){
        	for(int i = list.size(); i < 3; i++) {
        		list.add(list.get(i - 1));
        	}
        	for(String s : list) {
        		answer += s;
        	}
//        	return answer;
        }
        if(list.size() >= 15) {
        	if(list.get(14).equals(".")) {
        		for(int i = 0; i < 14; i++ ) {
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
	}
}
