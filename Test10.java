package Test;

public class Test10 {
	public static void main(String[] args) {
			for (int j = 4; j >= 0; j--) {
			int a = 43210;
			String str1 = Integer.toString(a);
			String res = str1.substring(j);
			System.out.println(res);
			
		}
			for(int i = 0; i < 5; i++) {
				for(int j = i; j >= 0; j--) {
					System.out.print(j);
				}
				System.out.println();
			}
	}
}
