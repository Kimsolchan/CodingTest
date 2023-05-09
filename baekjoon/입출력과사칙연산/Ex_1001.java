package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_1001 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int a, b;
        // Scanner클래스로 입력받은 값을 a, b에 저장.
		a = scanner.nextInt();
		b = scanner.nextInt();
		
        // a - b의 결과를 출력한다.
		System.out.print(a - b);
	}
}
