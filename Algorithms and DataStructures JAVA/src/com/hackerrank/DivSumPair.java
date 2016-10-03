package com.hackerrank;

import java.util.Scanner;

public class DivSumPair {
	static int cnt = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		calculate(a, k);
		System.out.println(cnt);
	}

	private static void calculate(int[] arr, int div) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (((arr[i] + arr[j]) % div) == 0)
					cnt++;
			}
		}
	}
}
