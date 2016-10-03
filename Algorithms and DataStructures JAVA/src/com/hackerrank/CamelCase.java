package com.hackerrank;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] s = in.next().toCharArray();
		int cnt=1;
		for (int i = 1; i < s.length; i++) {
			if(Character.isUpperCase(s[i])) cnt++;
		}System.out.println(cnt);
	}
}
