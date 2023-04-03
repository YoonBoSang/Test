package Test;

public class Test18 {
	public static void main(String[] args) {
		String my_string = "bus";
        String sum = "";
        String arr[] = my_string.split("");
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i].equals("u")) {
//            if(arr[i] == "e" || arr[i] == "u" || arr[i] == "i" || arr[i] == "o" || arr[i] == "l" || arr[i] == "a" || arr[i] == "u") {
                arr[i] = "";
            } sum += arr[i];
        }
        System.out.println(sum);
	}
}
