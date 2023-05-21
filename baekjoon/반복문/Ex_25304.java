package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// x : 영수증에 적힌 총 금액
		// n : 영수증에 적힌 구매한 물건의 종류의 수
		// a : 각 물건의 가격
		// b : 구매한 물건의 개수
		// c : (물건의 가격 * 물건의 개수) + ...
		int x, n, a, b,c;
		c = 0;
		
		x = sc.nextInt();
		n = sc.nextInt();
		
		for(int i=1; i<= n; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = c + (a * b);
		}
		
		if(x == c) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
