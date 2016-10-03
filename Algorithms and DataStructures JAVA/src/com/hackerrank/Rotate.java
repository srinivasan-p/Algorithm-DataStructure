package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Rotate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int rotate = sc.nextInt();
		int querries = sc.nextInt();sc.nextLine();
		String[] arr = sc.nextLine().split(" ");
		String[] arr1 = new String[size];
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			String temp = arr[i];
			if ((i + rotate % size) <= arr.length - 1) {
				arr1[i + rotate % size] = arr[i];
			} else {
				int idx = (i + rotate % size) - (arr.length - 1);
				arr1[idx-1] = arr[i];
			}

		}
		for (int i = 1; i <= querries; i++) {
			System.out.println(arr1[sc.nextInt()]);
		}
	}
}
/*
1 2 3 ---- 2 3 1 
3 2 1
2 3 1
2 1 3

3 2 -1
-2 3 -1

5 2 3



*/