package codingtest.baekjoon.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		// 최대값이 몇 번째 인덱스에 있는지 찾는 방법
		// https://velog.io/@chosj1526/Java-%EB%B0%B0%EC%97%B4%EC%97%90%EC%84%9C-%ED%8A%B9%EC%A0%95%EA%B0%92%EC%9D%98-%EC%9D%B8%EB%8D%B1%EC%8A%A4-%EA%B5%AC%ED%95%98%EA%B8%B0
		System.out.println(Arrays.asList(arr).indexOf(max));
	}
}
