package Test;
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
       int num1 = denom1 * denom2;
       int num2 = numer1 * denom2;
       int num3 = numer2 * denom1;
       int num4 = num2 + num3;        
       int temp[] = new int[2];
       
        if (num1 % 2 == 0 && num4 % 2 == 0) {
            temp[0] = num4 / 2;
            temp[1] = num1 / 2;
            return temp;
        	}else {
            temp[0] = num4;
            temp[1] = num1;
            return temp;
        }
        
    }
}