package Test;

public class Test25 {
	public static void main(String[] args) {
		int age = 124; // result bce;
		String result = "";
		String[] arr = String.valueOf(age).split(""); 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals("0")) {
				arr[i] = "a";
			} else if(arr[i].equals("1")) {
				arr[i] = "b";
			} else if(arr[i].equals("2")) {
				arr[i] = "c";
			} else if(arr[i].equals("3")) {
				arr[i] = "d";
			} else if(arr[i].equals("4")) {
				arr[i] = "e";	
			} else if(arr[i].equals("5")) {
				arr[i] = "f";
			} else if(arr[i].equals("6")) {
				arr[i] = "g";
			} else if(arr[i].equals("7")) {
				arr[i] = "h";
			} else if(arr[i].equals("8")) {
				arr[i] = "i";
			} else if(arr[i].equals("9")) {
				arr[i] = "j";
			}
			result += arr[i];
		} 
	}
}
