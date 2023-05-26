package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// 		int[] arr = new int[10];
		
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt() % 42;
//		}
		
		boolean[] l = new boolean[42]; // 어떤 숫자들를 42로 나누면 나올 수 있는 나머지는 0 ~41까지다.
		for(int i=0; i<10; i++) {
			int t = sc.nextInt() % 42;
			l[t] = true; // 나머지가 인덱스번호가 된다.
		} 
		int count = 0;
		for (int i =0;i < 42; i++) {
			if (l[i]) { // 배열에인덱스 요소가 true가 되있으면
				count++; // count값 1증가
			}
		}
		System.out.println(count);	
	}
}
