package com.hackerrank;

import java.util.Scanner;

public class TimeInWords {

	enum ones {
		zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen
	};

	enum tens {
		zero, ten, twenty, thirty, fourty, fifty, sixty, seventy, eighty, ninty
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		if (m == 00) {
			System.out.println(ones.values()[h] + " o' clock");
		} else if (m == 30) {
			System.out.println("half past " + ones.values()[h]);
		} else if (m == 15) {
			System.out.println("quarter past " + ones.values()[h]);
		} else if (m < 30) {
			if (m % 10 == 0) {
				System.out.println(tens.values()[m / 10] + " minutes past " + ones.values()[h]);
			} else if (m <= 19) {
				System.out.println(ones.values()[m] + " minutes past " + ones.values()[h]);
			} else {
				System.out.println(tens.values()[(m - (m % 10)) / 10] + " " + ones.values()[m % 10] + " minutes past "
						+ ones.values()[h]);
			}
		} else if (m > 30) {
			int remM = 60 - m;
			if (remM == 15) {
				System.out.println("quarter to " + ones.values()[h + 1]);
			} else if (remM <= 19) {
				System.out.println(ones.values()[remM] + " minutes to " + ones.values()[h + 1]);
			} else {
				System.out.println(tens.values()[(remM - (remM % 10)) / 10] + " " + ones.values()[remM % 10]
						+ " minutes to " + ones.values()[h + 1]);
			}
		}
	}
}
