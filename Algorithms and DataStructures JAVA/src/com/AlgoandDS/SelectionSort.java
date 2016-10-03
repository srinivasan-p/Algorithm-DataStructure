package com.AlgoandDS;

public class SelectionSort {
	public void sort(int[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		System.out.println("**************Selection Sort****************");
		for (int i = 0; i < values.length; i++) {
			int curMinIdx = i;
			for (int j = i + 1; j < values.length; j++) {
				if (values[j] <= values[curMinIdx]) {
					curMinIdx = j;
				}
			}
			if (i != curMinIdx) {
				int temp = values[i];
				values[i] = values[curMinIdx];
				values[curMinIdx] = temp;
			}

		}
	}

}
