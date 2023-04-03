package Test;

import java.util.Scanner;

public class Test95 {
	public static void main(String[] args) {
		String input = """
				472
				385
				""";
		
		Scanner scanner = new Scanner(input);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = B % 10;				//1		
		int D = (B % 100)/10;		//10
		int E = B / 100; 			//100
		
		int line3 = C * A;
		int line4 = D * A;
		int line5 = E * A;
		
		int line6 = line3 + (line4 * 10) + (line5 * 100);
		
		System.out.println(line3);
		System.out.println(line4);
		System.out.println(line5);
		System.out.println(line6);
		
				
	}
}
