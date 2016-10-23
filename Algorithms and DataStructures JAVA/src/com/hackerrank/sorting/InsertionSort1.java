package com.hackerrank.sorting;

import java.util.Scanner;

public class InsertionSort1 {

	public static void insertIntoSorted(int[] ar) {
		int num = ar[ar.length - 1];
		int i = 0;
		for (i = ar.length - 2; i >= 0; i--) {
			if (ar[i] > num) {
				ar[i + 1] = ar[i];
			} else if (ar[i] < num) {
				ar[i + 1] = num;
				break;
			}
			printArray(ar);
		}
		if (i == -1) {
			ar[0] = num;
		}
		printArray(ar);
	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}

}
