package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Pluses {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int row = in.nextInt();
		int col = in.nextInt();
		in.nextLine();
		String[][] grid = new String[row][col];
		for (int i = 0; i < grid.length; i++) {
			grid[i] = in.nextLine().split("");
		}
		printGrid(grid);
		int result = findTheGreatest(grid, "1") * findTheGreatest(grid, "2");
		System.out.println(result);
	}

	private static int findTheGreatest(String[][] grid, String pos) {
		int midRowIdx = -5;
		int midColIdx = -5;
		int ln = -5;
		fillThePulseWithPos(grid,pos,midRowIdx,midColIdx, ln);
		return 0;
	}

	private static void fillThePulseWithPos(String[][] grid, String pos, int midRowIdx, int midColIdx, int ln) {
		for (int out=0; out<=ln/2 && midColIdx>=0 && midRowIdx>=0 && ln>0; out++) {
			grid[midRowIdx+out][midColIdx] = pos;
			grid[midRowIdx-out][midColIdx] = pos;
			grid[midRowIdx][midColIdx+out] = pos;
			grid[midRowIdx][midColIdx-out] = pos;
		}
	}

	private static void printGrid(String[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			System.out.println(Arrays.toString(grid[i]));
		}
	}
}
