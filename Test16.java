package Test;

import java.util.Arrays;

public class Test16 {
	public static void main(String[] args) {
		String my_string = "Bcad";
        String answer = my_string.toLowerCase();
        String[] arr = answer.split("");
        String sum = "";
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
//        for(int i = 0; i < my_string.length(); i++) {
//            arr = new String[my_string.length()];
//            arr[i] = answer.split("");
//        }
        Arrays.sort(arr);
        System.out.println(sum);
	}
}
