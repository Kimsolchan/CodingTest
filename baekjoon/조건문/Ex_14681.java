package codingtest.baekjoon.조건문;

import java.util.Scanner;

public class Ex_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y,n;
		x = sc.nextInt();
		y = sc.nextInt();
		
		if(x >= 0 && y >= 0) {
			n = 1;
		}else if(x < 0 && y >= 0) {
			n = 2;
		}else if(x < 0 && y < 0) {
			n = 3;
		}else {
			n = 4;
		}
		
		System.out.println(n);
	}
}
