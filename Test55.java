package Test;

import java.util.*;

public class Test55 {
	public static void main(String[] args) {
		int[][] board = { { 1, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0 },
				{ 0, 0, 0, 0, 1 } };
		int answer = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {
					for (int k = j - 1; k < j + 2; k++) {
						System.out.println(Arrays.deepToString(board));
						System.out.println(k);
						System.out.println(i);
						System.out.println(j);
						if (0 <= k && k <= board.length - 1) {

							if (board[i][k] != 1 && k >= 0) {
								board[i][k] = 2;
							}
							if (i != 0 && board[i - 1][k] != 1 ) {
								board[i - 1][k] = 2;
							}
							if (i != board.length - 1 && board[i + 1][k] != 1 ) {
								System.out.println(k);
								board[i + 1][k] = 2;
							}
						}
					}
				}
			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 0) {
					answer++;
				}
			}
		}
	}
}
//					if (i == 0) {
//						for (int k = j - 1; k < j + 2; k++) {
//							if (j == 0 || k == board[0].length) {
//								continue;
//							}
//							if (board[i][k] != 1) {
//								board[i][k] = 2;
//							}
//							if (board[i + 1][k] != 1) {
//								board[i + 1][k] = 2;
//							}
//						}
//					} else if (i == board.length - 1) {
//						for (int k = j - 1; k < j + 2; k++) {
//							if (j == 0 || k == board[0].length) {
//								continue;
//							}
//							if (board[i][k] != 1) {
//								board[i][k] = 2;
//							}
//							if (board[i - 1][k] != 1) {
//								board[i - 1][k] = 2;
//							}
//						}
//					} else {