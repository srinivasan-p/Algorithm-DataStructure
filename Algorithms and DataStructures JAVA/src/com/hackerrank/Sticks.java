package com.hackerrank;

import java.util.Scanner;

public class Sticks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
		}
		while (true) {
			int minStick = getMinValue(arr);
			int cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > 0) {
					cnt++;
					arr[i] -= minStick;
				}
			}
			if (cnt == 0) {
				break;
			} else {
				System.out.println(cnt);
			}
		}
	}

	private static int getMinValue(int[] arr) {
		int min = 10000;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0 && arr[i] <= min)
				min = arr[i];
		}
		return min;
	}
}
