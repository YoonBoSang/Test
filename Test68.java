package Test;

public class Test68 {
	public static void main(String[] args) {
		String a = "a aaA";
		char[] arr = a.toCharArray();
		System.out.println(arr[1]);
		System.out.println(arr[1]== ' ');
		int c = 'A';
		System.out.println(c);
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((char)('h' - 26 + 20));
		String b = String.valueOf(arr[0]);
//		System.out.println(b);
	}
}
