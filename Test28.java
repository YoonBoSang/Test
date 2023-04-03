package Test;

public class Test28 {
	public static void main(String[] args) {
		
    	String letter = ".... . .-.. .-.. ---";
        String answer = "";
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String[] alpha = {"a", "b", "c"};

        String[] arr = letter.split(" ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < morse.length; j++) {
                if (morse[j].equals(arr[i])) answer += alpha[j];
            }
        }

//        return answer;
    }
}

