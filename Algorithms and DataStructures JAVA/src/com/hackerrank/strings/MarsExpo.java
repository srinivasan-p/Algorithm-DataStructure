package com.hackerrank.strings;

import java.util.Scanner;

public class MarsExpo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		char[] temp = { 'S', 'O', 'S' };
		int cnt = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != temp[i % 3]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
