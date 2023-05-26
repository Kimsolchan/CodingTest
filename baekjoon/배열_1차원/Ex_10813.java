package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m; // n : 바구니 범위 , m : 공바꾸는 횟수
		n = sc.nextInt();
		m = sc.nextInt();
		
//		int ballCount = 1; // 0. 1번 바구니에 집어넣을 공
		
		int[] arr = new int[n];
		
		// 1. 처음바구니에는 바구니 번호가 적혀있는 공이 들어있다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
//			arr[i] = ballCount; // arr[0] : 1...
//			ballCount++; // ballCount : 2...
		}
		
		// 2. i(a)번 바구니와 j(b)번 바구니에 들어있는 공을 서로 바꾼다.
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int tmp = arr[a-1];
			arr[a-1] = arr[b-1];
			arr[b-1] = tmp;
		}
		
		
		// 3. 바구니에 들어있는 공 출력
		for(int i=0; i<arr.length; i++) {System.out.print(arr[i] + " ");}
	}
}
