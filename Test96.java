package Test;

import java.util.Scanner;

public class Test96 {
	public static void main(String[] args) {
		String input = """
				4 5
				""";
		
		Scanner scanner = new Scanner(input);
		
		double A = scanner.nextDouble();
		double B = scanner.nextDouble();
		
		double sum = A / B;
		System.out.println(""+  (int)A + " / " + "" + (int)B + " = "   + sum);
		System.out.println(sum);
	}
}
