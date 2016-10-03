package com.AlgoandDS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort {

	public static void main(String[] args) throws IOException {
		BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
		int arraySize = Integer.parseInt(R.readLine());
		int[] inputArray = new int[arraySize];
		String[] inputStr = R.readLine().split(" ");
		for (int i = 0; i < arraySize; i++) {
			inputArray[i] = Integer.parseInt(inputStr[i]);
		}

//		MergeSortBest msb = new MergeSortBest();
//		msb.sort(inputArray);
//		printArray(inputArray);
		
//		QuickSort qSort = new QuickSort();
//		qSort.sort(inputArray);
//		printArray(inputArray);
		
//		SelectionSort sSort = new SelectionSort();
//		sSort.sort(inputArray);
		
		InsertionSort iSort  =  new InsertionSort();
		iSort.sort(inputArray);
		printArray(inputArray);
	}

	private static void printArray(int[] inputArray) {
		for (int j = 0; j < inputArray.length; j++) {
			System.out.print(inputArray[j] + " ");
		}
		System.out.println();
	}

}
