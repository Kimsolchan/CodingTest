package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", number, i, (number * i));
		}
	}
}
