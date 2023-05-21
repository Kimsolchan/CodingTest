package codingtest.baekjoon.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr); // int 배열 오름차순 정렬
		int min = arr[0]; // 최솟값 
		int max = arr[n-1]; // 최대값
		
		System.out.println(min + " " + max);
	}
}
