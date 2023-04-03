package Test;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		String input =" The first character is a blank";
		
		Scanner scanner = new Scanner(input);
//		String[] str1 = input.trim().split(" ");
//		System.out.println(str1.length);
		
		String line = scanner.nextLine();
		
		String[] arr = line.split(" ");
		int answer = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
