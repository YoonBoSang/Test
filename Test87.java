package Test;

public class Test87  {
	public static void main(String[] args) {
		int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2	};
		String hand = "left";
        String answer = "";
        int r = 10;
        int l = 8;
        int sumr = 0;
        int suml = 0;
        for(int i = 0; i < numbers.length; i++) {
        	System.out.println("numbers : " + numbers[i]);
        	System.out.println("l : " + l);
        	System.out.println("r : " + r);
            if(numbers[i] == 1 || numbers[i] == 4 ||numbers[i] == 7) {
                answer += "L";
                l = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 ||numbers[i] == 9) {
                answer += "R";
                r = numbers[i];
            } else if (numbers[i] == 2 || numbers[i] == 5 ||numbers[i] == 8 || numbers[i] == 0) {
                if(numbers[i] == 0) {
                    numbers[i] = 10;
                }
                if(l == 2 || l == 5 || l == 10 || l == 8) {
                	suml = l > numbers[i] ? - 2 : 2;
                	l += suml;
                }
                if(r == 2 || r == 5 || r == 10 || r == 8) {
                	sumr = r > numbers[i] ? -2 : 2;
                	r += sumr;
                }
                l += 2;

                if(Math.abs(numbers[i] - r) > Math.abs(numbers[i] - l)) {
                    answer += "L";
                    l = numbers[i];
                } else if (Math.abs(numbers[i] - r) == Math.abs(numbers[i] - l)) {
                	if(hand.equals("left")) {
                		answer += "L";
                		l = numbers[i];
                	} else {
                		answer += "R";
                		r = numbers[i];
                		l -= 2;
                	}
                } else {
                    answer += "R";
                    r = numbers[i];
                    l -= 2;
                }
                l -= suml;
                r -= sumr;
                suml = 0;
                sumr = 0;
            }
            System.out.println(answer);
            System.out.println("--------------------");
    }
}
}
