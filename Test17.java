package Test;

public class Test17 {
	public static void main(String[] args) {
		
	String rsp = "205";
//    String sum = "";
//    char[] arr1 = rsp.toCharArray();
//    for (int i = 0; i < arr1.length; i++) {
//        if(arr1[i] == '2') {
//            arr1[i] = '0';
//        } else if (arr1[i] == '0') {
//            arr1[i] = '5';
//        } else if (arr1[i] == '5') {
//            arr1[i] = '2';
//        }
//        sum += String.valueOf(arr1[i]);
//    }
//    System.out.println(sum);
	String answer = "";
	char[] array = rsp.toCharArray();
	
	for (char a : array) {
		char w = switch (a) {
				 case '0' -> '5';
				 case '2' -> '0';
				 case '5' -> '2';
				 default -> ' ';
		};
		answer += w;
	}
	String my_string = "bus";
	String arr[] = my_string.split("");
	System.out.println(answer);
}
}
//euiolau