package Test;

import java.util.*;

public class Test57 {
	public static void main(String[] args) {
		String[] babbling = { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" };
		int answer = 0;
		for (int i = 0; i < babbling.length; i++) {

			if (babbling[i].startsWith("aya")) {
				babbling[i] = babbling[i].replace("aya", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				i--;
				continue;
			}

			if (babbling[i].startsWith("ye")) {
				babbling[i] = babbling[i].replace("ye", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				i--;
				continue;
			}

			if (babbling[i].startsWith("ma")) {
				babbling[i] = babbling[i].replace("ma", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				i--;
				continue;
			}

			if (babbling[i].startsWith("woo")) {
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				i--;
				continue;
			}
		}
		System.out.println(Arrays.deepToString(babbling));
	}
}