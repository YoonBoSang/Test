package Test;

public class Test02 {
	public static void main(String[] args) {
		 max mm = new max();
		 long result = mm.higher(3, 5);
		 System.out.println(result);
	}
}

class max {
	int higher(int a, int b) {
//		if (a > b) {
//			return a;
//		} else {
//			return b;
//		}
		return a > b ? a : b;
	};
	int lower(int a, int b) {
		return a > b ? b : a;
	}
}
