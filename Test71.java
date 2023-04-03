package Test;

import java.util.*;

public class Test71 {
	public static void main(String[] args) {
		String[] strings = { "abce", "abcd", "cdx" };
		int n = 2;
		for (int i = 0; i < strings.length-1; i++) {
			for (int j = i + 1; j < strings.length; j++) {
				if (strings[i].charAt(n) == strings[j].charAt(n)) {
					for (int k = n; k < Math.max(strings[i].length(), strings[j].length()); k++) {
						if (strings[i].charAt(k) != strings[j].charAt(k)) {
							if (strings[i].charAt(k) > strings[j].charAt(k)) {
								String temp = strings[i];
								strings[i] = strings[j];
								strings[j] = temp;
								break;
							} else {
								break;
							}
						}
					}
				} else {
					if (strings[i].charAt(n) > strings[j].charAt(n)) {
						String temp = strings[i];
						strings[i] = strings[j];
						strings[j] = temp;
					}
				}
			}
		}
		System.out.println(Arrays.toString(strings));
	}
}
