package com.hackerrank;

import java.util.Scanner;

public class minusPlus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Double pos = 0.0;
		Double neg = 0.0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			int inp = in.nextInt();
			if (inp > 0)
				pos++;
			else if (inp < 0)
				neg++;
		}
		System.out.println((pos / n));
		System.out.println((neg / n));
		System.out.println(1 - Math.abs((pos / n) + (neg / n)));
	}
}
