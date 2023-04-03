package Test;

public class Test22 {
	public static void main(String[] args) {

		int n = 3;
		int[] numlist = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int j = 0;
		for (int i = 0; i < numlist.length; i++) {
			if (numlist[i] % n == 0) {
				numlist[j] = numlist[i];
				j++;
			}
		}
		System.out.println(numlist[0]);
		System.out.println(numlist[1]);
		System.out.println(numlist[2]);
//		System.out.println(j);
		int[] answer = new int[j];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = numlist[i];
		}
		System.out.println(answer[0]);
		System.out.println(answer[1]);
		System.out.println(answer[2]);
	}
}
