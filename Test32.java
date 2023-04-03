package Test;

public class Test32 {
	public static void main(String[] args) {
		int i = 3;
		int j = 10;
		int k = 2;
		int[] b = new int[100000];
		String A = "";
		int sum = 0;
		for (int a = i; a <= j; a++) {
			A = String.valueOf(a);
			for (int num1 = 0; num1 < A.length(); num1++) {
				b[num1] = A.charAt(num1) - 48;
				if (b[num1] == k) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
