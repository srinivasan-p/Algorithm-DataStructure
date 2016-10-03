package com.hackerrank;

import java.util.Scanner;

public class Kangaroo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x1 = in.nextLong();
		long v1 = in.nextLong();
		long x2 = in.nextLong();
		long v2 = in.nextLong();
		String result = "NO";
		if (v1 > v2) {
			while (x1 <= 1000000000 || x2 <= 1000000000) {
				if (x1 == x2) {
					result = "YES";
					break;
				}
				x1 += v1;
				x2 += v2;
			}
		}
		System.out.println(result);
	}
}
