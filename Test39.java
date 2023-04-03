package Test;

public class Test39 {
	public static void main(String[] args) {
		String my_string = "3 + 4 + 5 - 3 + 6 - 19 + 55";
		int answer = 0;
		String[] arr1 = my_string.split(" ");
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i].equals("+")) {
				arr1[i] = "";
			} else if (arr1[i].equals("-")) {
				arr1[i+1] = "-" + arr1[i+1];
				arr1[i] = "";
			}
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != "") {
				System.out.println(arr1[i]);
				answer += Integer.parseInt(arr1[i]);
			}
		}
	}
}
