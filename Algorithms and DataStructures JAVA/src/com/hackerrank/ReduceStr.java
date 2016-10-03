package com.hackerrank;

import java.util.Scanner;

public class ReduceStr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder(sc.nextLine());
		int i = 0;
		while (str.length()-1>i) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				str.delete(i, i + 2);
				i=0;
				continue;
			}
			i++;
		}
		System.out.println(str.length()==0?"Empty String":str);
	}
}
