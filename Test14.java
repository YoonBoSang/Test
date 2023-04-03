package Test;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		String input ="""
ABCDE
abcde
01234
FGHIJ
fghij
						""";
		Scanner scanner = new Scanner(input);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		String str4 = scanner.nextLine();
		String str5= scanner.nextLine();
		
		String[] str6 = str1.split("");
		String[] str7 = str2.split("");
		String[] str8 = str3.split("");
		String[] str9 = str4.split("");
		String[] str10 = str5.split("");
		String[][] str = {
				str6,
				str7,
				str8,
				str9,
				str10
		};
//		String[5][] arr =  
		
		for (int i = 0; i < 5;  i++) {
			for (int j = 0; j < 5; j++) {
		 System.out.print(str[j][i]);
			}
			
		}
	}
}
