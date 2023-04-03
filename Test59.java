package Test;

public class Test59 {
	public static void main(String[] args) {
		int num = 16;
        int answer = 0;
        long Num = num; 
        while(Num != 1) {
        	System.out.println(num);
            Num = Num % 2 == 0 ? Num / 2 : Num * 3 + 1;
            answer++;
            
            if(answer == 500) {
//                return -1;
            }
        }
	}
}
