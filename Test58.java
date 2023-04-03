package Test;

public class Test58 {
	public static void main(String[] args) {
		long n =2395285;
		int cnt = 0;
		long answer = 0;
		long a = n;
		String str = "";
		while(a > 0) {
			a = a/10;
			cnt++;
		}
		long[] arr = new long[cnt];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = n % 10;
			n = n / 10;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[i] < arr[j] ) {
				long temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		for(long i : arr) {
			str += String.valueOf(i);
		}
		answer = Long.valueOf(str);
		System.out.println(answer);
	}
}
