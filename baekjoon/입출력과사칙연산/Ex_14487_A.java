package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_14487_A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pointNumber = scanner.nextInt();
		int s = 0, m = 0;
		for(int i = 0; i < pointNumber; i++) {
			int d = scanner.nextInt();
			s+=d;
			if (m < d) {
				m = d;
			}
		}
		System.out.println(s - m);
		
	}
}
