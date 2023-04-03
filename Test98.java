package Test;

import java.util.Scanner;

public class Test98 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		
		for (int i = 0; i < A; i++) {
			int B = scanner.nextInt();
			int C = scanner.nextInt();
			System.out.println(B + C);
		}
	}
}
