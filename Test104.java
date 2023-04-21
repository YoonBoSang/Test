package Test;

import java.util.*;

public class Test104 {
	public static void main(String[] args) {
		String s = "baabaa";
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(stack.size() != 0 && arr[i].equals(stack.peek())) {
                stack.pop();
                continue;
            }
            stack.push(arr[i]);
        }
        if(stack.size() == 0) {
//            return 1;
        }
	}
}
