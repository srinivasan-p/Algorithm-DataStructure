package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		String flag = "start";
		int IStart = -1;
		int IEnd = -1;
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i + 1] < arr[i]) {
				flag = "Pos-Swap/Rev";
				IStart = i;
				i++;
				while (i < arr.length - 1) {
					if (arr[i + 1] < arr[i]) {
						i++;
					} else {
						IEnd = i;
						while (i < arr.length - 1) {
							if (arr[i + 1] > arr[i]) {
								i++;
							} else {
								IStart = -1;
								IEnd = -1;
								i = arr.length;
							}
						}
					}
				}
			} else {
				i++;
			}
		}
		System.out.println(IStart + " " + IEnd);
	}
}
