package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_2588 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1, n2;
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
	
		
		System.out.println(n1 * (n2 % 10)); // 어떤수 % 10 -> 일의자리숫자
		System.out.println(n1 * (n2 / 10 % 10));
		System.out.println(n1 * (n2 / 100));
		System.out.println(n1 * n2);
		// 일의 자리구하는 효율적인 방법
		// - 12345 
		int t1 = scanner.nextInt();
		int t2 = scanner.nextInt();
		//String tmp = String.valueOf(t2); // String tmp = Integer.toString(t2);
		// String.valueOf(); -> 문자열로 바꿔주는 String클래스의 static 내장함수(메서드) 
		// 13245 -> "12345"
		
		int tmpNum = t2; // tmpNum = 12345
		//for (int i = tmp.length() - 1;i >= 0; i--) { //
		while (tmpNum > 0) {
			//int data = tmpNum % 10 * t1; // 1의 자리...
			System.out.println(tmpNum % 10 * t1);
			tmpNum /= 10; // 1의 자리-> 10의자리
		}
		System.out.println(t1 * t2);
		
		// 0: 5 * t1 , 12345 -> 1234
		// 1: 4 * t1 , 1234 -> 123
		// 2: 3 * t1 , 123 -> 12
		// 3: 2 * t1 , 12 -> 1
		// 4: 1 * t1 , 1 -> 0
	}
}
