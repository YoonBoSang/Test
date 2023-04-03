package Test;

public class Test42 {
	public static void main(String[] args) {
		int[][] dots = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        int x = 0;
        int y = 0;
        for (int i = 1; i < dots.length; i++) {
            if(dots[0][0] == dots[i][0]) {
              y = dots[0][1] > dots[i][1] ? dots[0][1] - dots[i][1] : dots[i][1] - dots[0][1];
            }
        }
        for (int i = 0; i <dots.length; i++) {
        	if(dots[0][1] == dots[i][1]) {
        		x = dots[0][0] > dots[i][0] ? dots[0][0] - dots[i][0] : dots[i][0] - dots[0][0];
        	}
        }
        int answer = x*y;
        System.out.println(x*y);
	}
}
