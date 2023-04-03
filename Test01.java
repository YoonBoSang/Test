package Test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		String input = """
				23 40
				""";

		Scanner scanner = new Scanner(input);

		int H = scanner.nextInt();
		int M = scanner.nextInt();

		if (M < 45) {
			if (H - 1 < 0) {

				M = M + 15;
				H = H + 23;
			} else {
				M = M + 15;
				H = H - 1;
			}
			} else {
				M = M - 45;
		}
		System.out.println(H + " " + M);
	}
}
