package Test;

public class Test29 {
	public static void main(String[] args) {
		int n = 10;
		int sum = 1;
		int result = 10;
		for (int i = result; i > 0; i--) {
			sum *= i;
		}
		while(sum > n) {
			sum = sum / result;
			result--;
		}
		System.out.println(result);
	}
}
