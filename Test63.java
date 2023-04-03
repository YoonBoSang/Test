package Test;

public class Test63 {
	public static void main(String[] args) {
		int n = 45;
        String s1 = Integer.toString(n, 3);
        String s2 = "";
        String[] arr = s1.split("");
        for(int i = arr.length - 1; i >= 0; i--) {
            s2 += arr[i];
        }
        int answer = Integer.parseInt(s2, 3);
        
	}
}
