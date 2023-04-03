package Test;

public class Test38 {
	public static void main(String[] args) {
		int answer = 0;
		String s = "-1 -2 -3 Z";
        String[] arr1 = s.split(" ");
    	answer += Integer.parseInt(arr1[0]);
    	answer += Integer.parseInt(arr1[2]);
    	System.out.println(answer);
	}
}
