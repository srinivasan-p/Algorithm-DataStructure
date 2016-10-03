package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Encryption {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Double sqrtVal = Math.sqrt(s.length());
		String[][] arr = null;
		if (sqrtVal - Math.floor(sqrtVal) >= 0.5) {
			arr = new String[(int) Math.ceil(sqrtVal)][(int) Math.ceil(sqrtVal)];
		} else {
			arr = new String[(int) Math.floor(sqrtVal)][(int) Math.ceil(sqrtVal)];
		}
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], "");
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				try {
					System.out.print(s.charAt(((j * arr[0].length) + (i + 1)) - 1));
				} catch (StringIndexOutOfBoundsException e) {
					continue;
				}
			}
			System.out.print(" ");
		}
	}
}
