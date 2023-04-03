package Test;

public class Test33 {
	public static void main(String[] args) {
		String my_string = "aaaaa";
		my_string = my_string.replaceAll("\\D", " ").replaceAll("\\s+", " ").trim();
		if(my_string.equals("")) {
//			return 0;
		}
		String[] arr = my_string.split(" ");
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			answer += Integer.parseInt(arr[i]);
		}
//		if(answer == 0) {
//			return 0;
//		} else {
//			return answer;
//		}
		
//		int answer = 0;
//		String str1 = "";
//		String str2 = "";
//		String[] arr = my_string.split("");
//		int num1 = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j].matches("[0-9]")) {
//					if (j > 0) {
//						if (arr[j + 1].matches("[0-9]") || arr[j - 1].matches("[0-9]")) {
//							str1 += arr[j];
//						} else {
//							num1 += Integer.parseInt(arr[j]);
//						}
//					} else if (j == 0) {
//						if (arr[j +1].matches("[0-9]")) {
//							str1 += arr[j];
//						} else {
//							num1 += Integer.parseInt(arr[j]);
//						}
//					}
//				}
//			}
//			answer += Integer.parseInt(str1) + num1;
	}
}
