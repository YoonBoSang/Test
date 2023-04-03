package Test;

import java.util.*;

public class Test49 {
	public static void main(String[] args) {
		List<Integer> o2 = new ArrayList<>();
		List<Integer> o3 = new ArrayList<>();
		o2.add(1);
		o3.add(1);
		o3.add(1);
		o3.add(3);
		
		System.out.println(o2.get(0).equals(o3.get(2)));
	}
}
