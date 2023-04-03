package Test;

public class Test37 {
	public static void main(String[] args) {
		String s = "1 2 Z 3";
        int answer = 0;
        String[] arr1 = s.split(" ");
        String str1 = "";
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i].equals("Z")) {
                arr1[i] = "";
                arr1[i-1] = "";
            }
        }
        if(str1.equals("")) {
//        	return 0;
        }
        for(int i = 0; i < arr1.length; i++) {
        	if(!arr1[i].equals("")) {
            answer += Integer.parseInt(arr1[i]);
        	}
        }
        System.out.println(answer);
        
	}
}
