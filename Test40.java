package Test;

import java.math.*;

public class Test40 {
	public static void main(String[] args) {
		int balls = 30;
		int share = 2;
        BigInteger I = new BigInteger("1");
        BigInteger J = new BigInteger("1");
        BigInteger K = new BigInteger("1");
        for(int i = balls; i > 0; i--) {
            BigInteger a = BigInteger.valueOf(i);
            I = I.multiply(a);
        }
        for(int i = share; i > 0; i--) {
        	BigInteger a = BigInteger.valueOf(i);
        	J = J.multiply(a);
        }
        for(long i = balls - share; i > 0; i--) {
        	BigInteger a = BigInteger.valueOf(i);
        	K = K.multiply(a);
        }
        System.out.println(I.divide(K.multiply(J)));	
	}
}
