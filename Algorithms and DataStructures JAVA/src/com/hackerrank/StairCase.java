package com.hackerrank;

import java.util.Scanner;

public class StairCase {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= 1; j--) {
				if (j > i)
					System.out.print(" ");
				else
					System.out.print("#");
			}
			System.out.println();
		}
	}
}
