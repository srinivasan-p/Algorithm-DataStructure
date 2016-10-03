package com.hackerrank;

import java.util.Scanner;

public class AngryProf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int cnt = 0;
			for (int a_i = 0; a_i < n; a_i++) {
				int temp = in.nextInt();
				if (temp <= 0)
					cnt++;
			}
			System.out.println((cnt >= k)?"NO":"YES");
		}

	}

}
