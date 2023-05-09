package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_1000 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.print(a + b);
		
		scanner.close();
	}
}
