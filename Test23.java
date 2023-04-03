package Test;

import java.util.Arrays;

public class Test23 {
	public static void main(String[] args) {
	int[] numbers = {1, 2, -3, 4, -5};
    Arrays.sort(numbers);
    System.out.println(numbers[numbers.length-1]);
    System.out.println(numbers[numbers.length-2]);
    int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
    System.out.println(answer);
	}
}
