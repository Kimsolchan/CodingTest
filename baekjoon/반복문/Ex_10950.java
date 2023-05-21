package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int repeatNumber, a, b;
		repeatNumber = sc.nextInt(); 
		
		for(int i = 1; i <= repeatNumber; i++) {
			a = sc.nextInt(); 
			b = sc.nextInt(); 
			System.out.println(a + b);
		}
	}
}
