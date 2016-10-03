package com.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinDis {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long A[] = new long[n];
		Map<Long, Integer> map = new HashMap<>();
		for (int A_i = 0; A_i < n; A_i++) {
			A[A_i] = in.nextLong();
			if(map.containsKey(A[A_i])){ //Old Entry
				map.put(A[A_i], A_i - (map.get(A[A_i])-n));
			}else{ //New Entry
				map.put(A[A_i], A_i+n);
			}
		}
		System.out.println(Collections.min(map.values())>n?"-1":Collections.min(map.values()));
	}
}
