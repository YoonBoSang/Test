package Test;

public class Test54 {
	public static void main(String[] args) {
		String s = "10101";
		int a = Integer.parseInt(s, 2);
		System.out.println(a);
		String b = Integer.toBinaryString(a);
		System.out.println(b);
	}
}
