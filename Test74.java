package Test;

public class Test74 {
	public static void main(String[] args) {
		String t = "500220839878";
		String p = "7";
        int answer = 0;
        for(int i = 0; i < t.length() - (p.length() - 1); i++) {
        	System.out.println(Integer.parseInt(p) >= Integer.parseInt(t.substring(i, i + p.length())));
            if(Integer.parseInt(p) >= Integer.parseInt(t.substring(i, i + p.length()))) {
                answer++;
            }
        }
        System.out.println(answer);
	}
}
