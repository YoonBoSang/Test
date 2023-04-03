package Test;

public class Test21 {
	public static void main(String[] args) {
		String my_string =  "hi12392";
        int[] answer = null;
        String str = my_string.replaceAll("[a-z]", "");
        String[] arr = str.split("");
        System.out.println(Integer.parseInt(arr[1]));
        for (int i = 0; i < arr.length; i++) {
            answer = new int[arr.length];
            answer[i] = Integer.parseInt(arr[i]);
        }
        System.out.println(answer[1]);
        
	}
}
