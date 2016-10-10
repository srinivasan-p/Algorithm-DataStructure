package com.hackerrank.strings;

import java.util.Scanner;

public class BeautifulBinary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String B = in.next();
		int cnt = 0;
		while (B.indexOf("010")>-1) {
			B=B.replaceFirst("010", "011");
			cnt++;
		}
		System.out.println(cnt);
	}
}