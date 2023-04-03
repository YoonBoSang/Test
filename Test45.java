package Test;

public class Test45 {
	public static void main(String[] args) {
		int a = 12;
		int b = 21;
		int answer = 0;
		int[] arr1 = new int[100];
		int[] arr2 = new int[100];
		int I = 0;
		int J = 0;
		int k = 0;
		int h = 0;
		for (int i = 2; i < 10; i++) {
			if (a % i == 0) {
				a = a / i;
				arr1[k] = i;
				k = k + 1;
				i--;
			}
		}
		for (int i = 2; i < 10; i++) {
			if (b % i == 0) {
				b = b / i;
				arr2[h] = i;
				h = h + 1;
				i--;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr1[i] = 0;
					arr2[j] = 0;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0 && arr2[i] != 2 && arr2[i] != 5) {
//				return 2;
				System.out.println(2);	
			}
		}
	}
}
