package Test;

public class Test19 {
	public static void main(String[] args) {
		String my_string = "aAb1B2cC34oOp";
		int answer = 0;
		String str1 = my_string.replaceAll("[a-zA-Z]", "");
		System.out.println(str1);
		String[] arr = my_string.split("");
//		for(int i = 0; i < my_string.length(); i++) {
//		    answer += Integer.parseInt(arr[i]);
		}
	}
//}
//}
//23-