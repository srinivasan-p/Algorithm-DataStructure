package com.hackerrank;

import java.util.Scanner;

public class AlmostSorted {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}
		int curIdx = 0;
		int stIdx = -1;
		int enIdx = -1;
		boolean pos = true;
		while (curIdx < arr.length - 1) {
			if (arr[curIdx] > arr[curIdx + 1]) { // Not sorted
				stIdx = curIdx;
				if (curIdx + 2 < arr.length && arr[curIdx + 1] > arr[curIdx + 2]) { // reverse
					while (curIdx < arr.length - 1) {
						if (arr[curIdx] < arr[curIdx + 1]) { // end of reverse
							enIdx = curIdx;
							break;
						}
						curIdx++;
					}
					if (curIdx + 1 < arr.length && arr[curIdx + 1] < arr[stIdx]) {
						pos = false;
					}
					while (curIdx < arr.length - 1) { // Checking remaining
						if (arr[curIdx] > arr[curIdx + 1]) {
							pos = false;
						}
						curIdx++;
					}
					if (pos) {
						System.out.println("yes");
						System.out.println("reverse " + (stIdx + 1) + " " + (enIdx + 1));
						System.exit(0);
					} else {
						System.out.println("no");
						System.exit(0);
					}
				} else {// swap
					int revCurIdx = arr.length - 1;
					while (revCurIdx > curIdx) {
						if (arr[revCurIdx - 1] > arr[revCurIdx]) {
							enIdx = revCurIdx;
							break;
						}
						revCurIdx--;
					}
					if (enIdx + 1 < arr.length && arr[stIdx] > arr[enIdx + 1]) {
						pos = false;
					}
					if (stIdx - 1 >= 0 && arr[stIdx - 1] > arr[enIdx]) {
						pos = false;
					}
					revCurIdx--;
					while (revCurIdx > curIdx + 1) { // Checking remaining
						if (arr[revCurIdx - 1] > arr[revCurIdx]) {
							pos = false;
						}
						revCurIdx--;
					}
					if (pos) {
						System.out.println("yes");
						System.out.println("swap " + (stIdx + 1) + " " + (enIdx + 1));
						System.exit(0);
					} else {
						System.out.println("no");
						System.exit(0);
					}
				}
			}
			curIdx++;
		}
		System.out.println("yes");
	}
}