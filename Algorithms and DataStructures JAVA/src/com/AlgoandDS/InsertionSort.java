package com.AlgoandDS;

import java.util.Arrays;

public class InsertionSort {
	public void sort(int[] values) {
		if (values == null || values.length == 0) {
			return;
		}
		System.out.println("**************Insertion Sort****************");
		for (int i = 1; i < values.length; i++) {
			int curMinIdx = -1;
			for (int j = i-1; j >=0; j--) {
				if(values[i] <= values[j]){
					curMinIdx = j;
				}
			}
			if(curMinIdx!=-1){
				int [] temp = Arrays.copyOfRange(values, curMinIdx, i);
				int t = values[i];
				System.arraycopy(temp, 0, values, curMinIdx+1, temp.length);
				values[curMinIdx] = t;
			}
		}
	}
}
//best
//public static void InsertionSort( int [ ] num)
//{
//     int j;                     // the number of items sorted so far
//     int key;                // the item to be inserted
//     int i;  
//
//     for (j = 1; j < num.length; j++)    // Start with 1 (not 0)
//    {
//           key = num[ j ];
//           for(i = j - 1; (i >= 0) && (num[ i ] < key); i--)   // Smaller values are moving up
//          {
//                 num[ i+1 ] = num[ i ];
//          }
//         num[ i+1 ] = key;    // Put the key in its proper location
//     }
//}