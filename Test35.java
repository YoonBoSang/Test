package Test;

public class Test35 {
	public static void main(String[] args) {
		int n = 420;
		int[] arr = new int[100];
		int j = 0;
		int k = 0;
		int b = n;
		for (int i = 2; i < 100; i++) {
			if (n % i == 0) {
				n = n / i;
				arr[j] = i;
				i--;
				j++;
			}
		}
		if(b == n) {
			int[] arr2 = {b};
//			return arr2;
		}
		for (int i = 0; i < 100; i++) {
			for (int a = 0; a < 100; a++) {
				if (i != a && arr[i] == arr[a] && arr[i] != 0) {
					arr[a] = 0;
                    j--;
				}
			}
		}
		int[] answer = new int[j];
		for (int i = 0; i < 100; i++) {
			if (arr[i] != 0) {
				answer[k] = arr[i];
				System.out.println(answer[k]);
				k++;
			}
		}
	}
}
