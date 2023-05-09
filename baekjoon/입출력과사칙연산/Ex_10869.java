package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_10869 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}
