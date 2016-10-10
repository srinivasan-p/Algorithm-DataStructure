package com.hackerrank.strings;

import java.util.Scanner;

public class FunnyString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String str = sc.next();
			String res = "Funny";
			for (int j = 1; j < str.length(); j++) {
				if ((Math.abs(str.charAt(j) - str.charAt(j - 1))) != (Math
						.abs(str.charAt(str.length() - 1 - j) - str.charAt(str.length() - 1 - (j - 1))))) {
					res = "Not Funny";
					break;
				}
			}
			System.out.println(res);
		}
	}
}
