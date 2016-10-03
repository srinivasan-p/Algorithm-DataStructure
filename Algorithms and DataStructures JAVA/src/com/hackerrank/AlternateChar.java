package com.hackerrank;

import java.util.Scanner;

public class AlternateChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inpCnt = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < inpCnt; i++) {
			printCnt(new StringBuffer(sc.nextLine()));
		}

	}

	private static void printCnt(StringBuffer str) {
		int i = 0;
		int cnt = 0;
		while (i < (str.length() - 1)) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				str.delete(i, i + 1);
				cnt++;
				i = i;
				continue;
			}
			i++;
		}
		System.out.println(cnt);
	}
}
