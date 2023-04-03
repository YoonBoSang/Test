package Test;

import java.util.*;

public class Test51 {
	public static void main(String[] args) {
		int denom1 = 2;
		int denom2 = 4;
		int numer1 = 1;
		int numer2 = 3;
		int num1 = denom1 * denom2;
		int num2 = numer1 * denom2;
		int num3 = numer2 * denom1;
		int num4 = num2 + num3;
		int temp[] = new int[2];

		for (int i = 2; i < num1; i++) {
			if (num1 % i == 0 && num4 % i == 0) {
				num1 = num1 / i;
				num4 = num4 / i;
				i--;
			}
		}
		temp[0] = num4;
		temp[1] = num1;
//		return temp;
		System.out.println(Arrays.toString(temp));
	}
}
