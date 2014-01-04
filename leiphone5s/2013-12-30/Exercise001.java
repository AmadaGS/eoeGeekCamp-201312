package com.fengleiit.work;

public class Exercise001 {
	public static void main(String[] args) {
		int[][] a = new int[9][9];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (i + 1) * (j + 1);
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i ; j++) {
				System.out.print((j + 1) + "*" + (i + 1) + "=");
				if (a[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
