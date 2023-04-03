package Test;

import java.util.Arrays;

public class Test15 {
	public static void main(String[] args) {

		String n = "15";
		int N = Integer.parseInt(n);
		String[] arr = new String[(N - 1) / 2 + 1];
		int j = 0;
		for (int i = 1; i <= N; i += 2) {
			arr[j] = String.valueOf(i);
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
