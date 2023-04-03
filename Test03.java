package Test;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		String input = """
				26
				""";
		
		Scanner scanner = new Scanner(input);
		
		int N = scanner.nextInt();
		int NC = N;
		int num = 0;
		int sum = 0;
//		for (int i = 0; i != N; sum++) {
//			int FC = NC / 10 + NC % 10;  		//10의자리 1의자리 더한값 넣기
//			i = ((NC % 10) * 10) + FC % 10;		//양변 첫번째 자리 합치기
//			NC = i;
//			}
//		System.out.println(sum);
		do {
		int FC = NC / 10 + NC % 10;  			//10의자리 1의자리 더한값 넣기
		num = (NC % 10) * 10 + FC % 10;		//양변 첫번째 자리 합치기
		NC = num;
		sum += 1;
		} while (N != num);
		System.out.println(sum);
	}
	}

