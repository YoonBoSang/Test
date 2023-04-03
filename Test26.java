package Test;

public class Test26 {
	public static void main(String[] args) {
		int n = 24;
        int sum = 0;
        int[] arr = new int[n];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr[j] = i;
                j++;
            }
        }
        System.out.println(arr[8]);
        int[] answer = new int[j];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i]; 
        }
        System.out.println(answer[7]);
//        return answer;
	}
}
