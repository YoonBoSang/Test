package Test;

import java.util.*;

public class Test69 {
	public static void main(String[] args) {
		int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        System.out.println(Arrays.deepToString(sizes));
        for(int i = 0; i < sizes.length; i++) {
            max1 = Math.max(sizes[i][0], max1);
            max2 = Math.max(sizes[i][1], max2);
        }
        System.out.println(max1);
        System.out.println(max2);
	}
}
