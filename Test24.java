package Test;

public class Test24 {
	public static void main(String[] args) {
		int[] numbers = { 4, 455, 6, 4, -1, 45, 6 };
		String direction = "right";
		int temp1 = 0;
		int temp2 = 0;
		temp1 = numbers[numbers.length - 1];
		temp2 = numbers[0];
		for (int i = numbers.length - 1; i >= 0; i--) {
			if (direction.equals("right") && i != 0) {
				numbers[i] = numbers[i - 1];
			} else if (direction.equals("right") && i == 0) {
				numbers[0] = temp1;
			}
		}

		for (int i = 0; i < numbers.length; i++) {
			if (direction.equals("left") && i != numbers.length - 1) {
				numbers[i] = numbers[i + 1];
			} else if (direction.equals("left") && i == numbers.length - 1) {

				numbers[numbers.length - 1] = temp2;
			}
		}
	}
}
