package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_11399_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] times = new int[n];
		for (int i = 0 ; i < n ; i++) {
			times[i] = sc.nextInt();
		}
		for (int i = 0; i<n -1 ;i++) {
			for (int j = 0; j < n - 1; j++) {
				if (times[j] > times[j + 1]) {
					int tmp =  times[j];
					times[j] = times[j + 1];
					times[j + 1] = tmp;
				}
			}
		}
		int s = 0;
		for (int i = 0 ; i < n; i++ ) {
			s += times[i] * (n - i); // s = s + times[i] * (n - i);
		}
		System.out.println(s);
	}
}
