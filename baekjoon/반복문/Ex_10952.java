package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_10952 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		while(true) {
			a = sc.nextInt();
			b = sc.nextInt();
			if(a != 0 && b !=0) {
				System.out.println(a + b);
			}else if(a == 0 && b == 0) {break;}

		}

	}
}
