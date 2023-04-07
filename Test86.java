package Test;

public class Test86 {
	public static void main(String[] args) {
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        int answer = 0;
        for(int i = 0; i < babbling.length; i++) {
            if(babbling[i].contains("aya") && !babbling[i].contains("ayaaya")) {
                babbling[i] = babbling[i].replace("aya", " ");
            }
            if (babbling[i].contains("ye") && !babbling[i].contains("yeye")) {
            	babbling[i] = babbling[i].replace("ye", " ");
            }
            if (babbling[i].contains("woo") && !babbling[i].contains("woowoo")) {
            	babbling[i] = babbling[i].replace("woo", " ");
            }
            if (babbling[i].contains("ma") && !babbling[i].contains("mama")) {
            	babbling[i] = babbling[i].replace("ma", " ");
            }
            System.out.println(babbling[i]);
            if(babbling[i].matches("[' ']+")) {
                answer++;
            }
        }
        System.out.println(answer);
	}
}
