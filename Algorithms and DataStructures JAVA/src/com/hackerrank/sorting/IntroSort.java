package com.hackerrank.sorting;

import java.util.Scanner;

public class IntroSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int toSearch = sc.nextInt();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (sc.nextInt() == toSearch) {
				System.out.println(i);
				break;
			}
		}
	}
}