package Test;

public class Test27 {
	public static void main(String[] args) {
		int k = 1;
		int num = 29183;
		int j = 0;
		String str1 = String.valueOf(k);
		String[] arr = String.valueOf(num).split("");
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str1)) {
				answer[j] = i;
				j++;
			}
		}
	}
}
