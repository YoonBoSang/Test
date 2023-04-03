package Test;

import java.util.*;

public class Test56 {
	public static void main(String[] args) {
		String[] babbling = { "aya", "yee", "u", "maa", "wyeoo" };
		int answer = 0;
		
		for (int i = 0; i < babbling.length; i++) {
			System.out.println(Arrays.deepToString(babbling));
			
			if (babbling[i].contains("ye") && babbling[i].contains("ma") && babbling[i].contains("aya") && babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("ye", "");
				babbling[i] = babbling[i].replace("ma", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			if (babbling[i].contains("aya") && babbling[i].contains("ma") && babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("ma", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			if (babbling[i].contains("aya") && babbling[i].contains("ye") && babbling[i].contains("ma")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("ye", "");
				babbling[i] = babbling[i].replace("ma", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("woo") && babbling[i].contains("ye") && babbling[i].contains("ma")) {
				babbling[i] = babbling[i].replace("ye", "");
				babbling[i] = babbling[i].replace("ma", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			if (babbling[i].contains("aya") && babbling[i].contains("ye") && babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("ye", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			if (babbling[i].contains("ma") && babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("ma", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			if (babbling[i].contains("aya") && babbling[i].contains("ye")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("ye", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			
			
			if (babbling[i].contains("aya") && babbling[i].contains("ma")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("ma", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("aya") && babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("aya", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("ye") && babbling[i].contains("ma")) {
				babbling[i] = babbling[i].replace("ye", "");
				babbling[i] = babbling[i].replace("ma", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("ye") && babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("ye", "");
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("aya")) {
				babbling[i] = babbling[i].replace("aya", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("ye")) {
				babbling[i] = babbling[i].replace("ye", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("ma")) {
				babbling[i] = babbling[i].replace("ma", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			if (babbling[i].contains("woo")) {
				babbling[i] = babbling[i].replace("woo", "");
				if (babbling[i].equals("")) {
					answer++;
				}
				continue;
			}
			
			
		}

	}
}
