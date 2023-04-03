package Test;

import java.util.*;

public class Test41 {
	public static void main(String[] args) {
		String[] spell = { "p", "o", "s" };
		String[] dic = { "sod", "eocd", "qixm", "adio", "soo" };
//		int answer = 0;
//		for (int i = 0; i < dic.length; i++) {
//			String[] arr1 = dic[i].split("");
//			for (int j = 0; j < arr1.length; j++) {
//				for (int k = 0; k < arr1.length; k++) {
//					if (arr1[j].equals(arr1[k]) && j != k) {
//						arr1[k] = "";
//					}
//				}
//			}
//			for (int j = 0; j < arr1.length; j++) {
//				for (int k = 0; k < spell.length; k++) {
//
//					if (spell[k].equals(arr1[j])) {
//						answer++;
//					}
//				}
//			}
//			if (answer == spell.length) {
////                return 1;
//			}
//			answer = 0;
//		}
        for(int i=0;i<dic.length;i++){
            int answer = 0;
            for(int j=0;j<spell.length;j++){
                if(dic[i].contains(spell[j])) answer ++;
            }
            if(answer==spell.length)
//            	return 1;
            	System.out.println(1);
        }
//        return 2;
        System.out.println(2);
	}
}
