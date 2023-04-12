package Test;

public class Test90 {
	public static void main(String[] args) {
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        int answer = 0;
        String s = "";
        int cnt = 0;
        for(int i : ingredient) {
            s += i + "";
            if(i == 1) {
                cnt++;
            }
        }
        for(int i = 0; i < cnt/2; i++) {
        	if(s.contains("1231")) {
        		s = s.replaceFirst("1231", "");
        		answer++;
        	}        	
        }
        System.out.println(answer);
	}
}
