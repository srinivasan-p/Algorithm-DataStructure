package com.AlgoandDS;

public class QuickSort {
	private int[] numbers;
	private int number;

	public void sort(int[] values) {
		// check for empty or null array
		if (values == null || values.length == 0) {
			return;
		}
		this.numbers = values;
		number = values.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;
		// Get the pivot element from the middle of the list
		int pivot = numbers[low + (high - low) / 2];
		System.out.println("*****Start of a sort****");
		System.out.println(i+ " " + j);
		System.out.println(pivot);
		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the pivot
			// element then get the next element from the left list
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
			}
		}
		System.out.println(i+ " " + j);
		// Recursion
		if (low < j) {
			System.out.print("Low -->");
			for (int j1 = low; j1 < j; j1++) {
				System.out.print(numbers[j1] + " ");
			}
			System.out.println();
			quicksort(low, j);
		}
		if (i < high) {
			System.out.print("High -->");
			for (int j1 = i; j1 < high; j1++) {
				System.out.print(numbers[j1] + " ");
			}
			System.out.println();
			quicksort(i, high);
		}

	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}
}
