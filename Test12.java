package Test;

public class Test12 {
	public static void main(String[] args) {
		
		int n = 3;
		int a = 0;
		int b = n;
		String my_string = "abcdef123";
		if(my_string.length()%n == 0) {
			
			a = my_string.length()/n;
		} else {
			a = my_string.length()/n + 1;
		}
		
		String[] answer = new String[a];
		
		for (int i = 0; i < a; i++) {
			if(n < my_string.length()) {
				
			answer[i] = my_string.substring(n-b, n);
			n += b;
			} else {
				answer[i] = my_string.substring(n-b, my_string.length());
				
			}
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
		
	}
}
