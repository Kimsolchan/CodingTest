package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 요구사항
		// 배열 만들고, 배열에 인덱스 요소중 최댓값과 최댓값이 배열의 몇번째요소에 있는지 출력해라
		
		int[] arr = new int[9];
		int max = arr[0];
		int maxIndex = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
				maxIndex = i;
			}
		}
		
		System.out.println(max);
		System.out.println(maxIndex + 1);
	}
}
