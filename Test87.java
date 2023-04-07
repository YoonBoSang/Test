class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int r = 0;
        int l = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 4 ||numbers[i] == 7) {
                answer += "L";
                l = number[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 ||numbers[i] == 9) {
                answer += "R";
                r = number[r];
            } else if (numbers[i] == 2 || numbers[i] == 5 ||numbers[i] == 8 || numbers[i] == 0) {
                if(numbers[i] == 0) {
                    numbers[i] = 10;
                }
                if(hand.equals("right")) {
                    l += 1;
                } else {
                    l += 3;
                }
                if(Math.abs(numbers[i] - r) > Math.abs(numbers[i] - l)) {
                    answer += "L";
                } else {
                    answer += "R";
                }
            }
    }
        return answer;
}
}