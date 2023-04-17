package Test;

public class Test102 {
	public static void main(String[] args) {
		int number = 5;
		int limit = 3;
		int power = 2;
        int answer = 0;
        int sum = 1;
        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= i/2; j++) {
                if(i % j == 0) {
                    sum++;
                }
            }
            if(sum <= limit) {
                answer += sum;
            } else {
                answer += power;
            }
            sum = 1;
        }
	}
}
