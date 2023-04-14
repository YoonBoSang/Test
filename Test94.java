package Test;

public class Test94 {
	public static void main(String[] args) {
//		String s = "(())()";
		String s = "0111010";
        boolean answer = true;
//        while(s.contains("()")) {
//            s.replace("()", "");
//            System.out.println(s);
//        }
        if(!s.equals("")) {
            answer = false;
        }	
        System.out.println(Integer.parseInt(s, 2));
	}
}
