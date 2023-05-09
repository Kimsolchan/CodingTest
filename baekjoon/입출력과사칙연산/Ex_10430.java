package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_10430 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		// a = 5, b = 8, c = 4
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		
		System.out.println((a+b)%c); // (5 + 8) % 4 = 1
		System.out.println(((a%c) + (b%c))%c); // 5 % 4 = 1
		System.out.println((a*b)%c); // (40) % 4 = 0
		System.out.println((a%c) * (b%c) %c); // 1*0%4 = 0
	}
}