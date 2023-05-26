package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, x;
		n = sc.nextInt();
		x = sc.nextInt();
		
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<x) {
				System.out.print(arr[i] + " ");
			}
		}
		
	}
}
