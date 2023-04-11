package Test;

public class Test88 {
	public static void main(String[] args) {
		String s = "abracadabra";
        int answer = 0;
        int cnt = 1;
        int a = 0;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(a) == s.charAt(i)) {
                cnt++;
            } else {
                cnt--;
            }
            if(cnt == 0) {
            	answer++;
            	if(i + 1 == s.length() - 1){
            		answer++;
            		break;
            	}
            	a = i + 1;
            	i = i + 1;
            	cnt = 1;
            } else if(i == s.length() - 1) {
            	answer++;
            }
        }
	}
	
}
