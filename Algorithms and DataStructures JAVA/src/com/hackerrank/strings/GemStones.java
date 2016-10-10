package com.hackerrank.strings;

import java.util.Scanner;

public class GemStones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] strArr = new String[N];
		int cnt = 0;
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.next();
		}
		for (int i = 97; i <= 122; i++) {
			boolean flag = true;
			for (int j = 0; j < strArr.length; j++) {
				if(strArr[j].indexOf((char) i)==-1){
					flag =false;
					break;
				}
			}
			if(flag){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
