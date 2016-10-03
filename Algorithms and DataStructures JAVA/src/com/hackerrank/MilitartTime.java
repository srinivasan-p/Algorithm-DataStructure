package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class MilitartTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		String[] arr = time.substring(0, 8).split(":");
		int format = time.substring(8, 9).equalsIgnoreCase("A") ? 0 : 1;
		// System.out.println(Arrays.toString(arr));
		if (format == 0 && arr[0].equals("12")) {
			arr[0] = "00";
		} else {
			arr[0] = Integer.toString(Integer.parseInt(arr[0]) + 12);
			if (arr[0].equals("24"))
				arr[0] = "00";
		}
		System.out.println(arr[0]+":"+arr[1]+":"+arr[2]);
	}
}
