package com.hackerrank;

import java.util.Scanner;

public class Pangram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();
		String result = "pangram";
		for (int i = 97; i <= 122; i++) {
			if (str.indexOf(Character.toString((char) i)) == -1) {
				result = "not pangram";
				break;
			}
		}
		System.out.println(result);
	}
}

