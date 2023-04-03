package Test;

import java.util.Scanner;

public class Test99 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();
		
		Scanner line1scanner = new Scanner(line1);
		Scanner line2scanner = new Scanner(line2);
		
				
		int num1 = line1scanner.nextInt();
		int num2 = line1scanner.nextInt();
		int num3 = line2scanner.nextInt();
		int num4 = num2 + num3;
		
		if(num4 > 60) {
			num4 = num4 - 60;
			num1 = (num1 + 1) % 24;
		}
		System.out.print(num1);
		System.out.print(" ");
		System.out.print(num4);
}
}