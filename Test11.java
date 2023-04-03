package Test;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		String input ="""
				3
				ACDKJFOWIEGHE
				O
				AB
				""";
		Scanner scanner = new Scanner(input);
//		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
//		
		int a = Integer.parseInt(str1);
//		
//		String[] strarr = new String[a];
//		
//		for (int i = 0; i < a; i++) {
//			strarr[i] = scanner.nextLine();
//		}
//		for (int j = 0; j < a; j++) {
//			System.out.print(strarr[j].charAt(0));
//			System.out.print(strarr[j].charAt(strarr[j].length()-1));
//			System.out.println();
//			}
		for (int i = 0; i < a; i++) {
			String str = scanner.nextLine();
			
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
			
			System.out.println("" + first + last);
		}
	}
}
