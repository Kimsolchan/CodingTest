package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_2439 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number; // 별찍기를 몇 번 반복할 것인지 입력
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=number-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
