package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_10810 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		n = sc.nextInt(); // 바구니범위
		m = sc.nextInt(); // 공을 넣는 횟수
		//  i(a): 2, j(b) : 5, k(c) : 6 -> 2번~5번 바구니에 6번 공을 넣는다.
		int a,b,c;
		
		// 0. 바구니 생성
		int[] arr = new int[n];
		
		// 1. 처음 바구니에는 공이 들어있지 않다.
		for(int i=0; i<arr.length; i++) {arr[i] = 0;}
		
		// 2. a번~b번 바구니까지 c번 공을 m번 반복해서 넣는다.
		for(int i=0; i<m; i++) {
			a = sc.nextInt(); // a번 바구니부터 ex : a -> 1
			b = sc.nextInt(); // b번 바구니에 ex : b -> 2
			c = sc.nextInt(); // 공을 넣는다. ex : c -> 3 -> arr[0] : 3 , arr[1] : 3
			for(int j=a-1; j<b; j++) {
				arr[j] = c;
			}
		}
		
		// 3. 바구니에 들어있는 공을 출력한다.
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
