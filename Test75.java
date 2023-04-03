package Test;

public class Test75 {
	public static void main(String[] args) {
		// 2월 29일까지
		int a = 3;
		int b = 16;
		String[] arr = { "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		String answer = "";
		if (a == 1) {
//            return arr[b % 7];
			System.out.println(arr[b % 7] );
		} else if (a == 2) {
			b = b + 31 * (a - 1);
		} else if(a < 8){
			b = b + (31 * (a - 1) - 2 - (a - 2) / 2);
		} else {
			b = b + (31 * (a - 1) - 1 - (a - 2) / 2);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (b % 7 == i) {
				answer += arr[i];
			}

		}
		System.out.println(answer);
	}
}
