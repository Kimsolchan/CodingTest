package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_2439 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number; // 별찍기를 몇 번 반복할 것인지 입력
		number = sc.nextInt();
		
		// 1번for문 :  ex) i=1; i<=number(5); i++;
		for(int i=1; i<=number; i++) {
			// 2번 for문 : j=1; j<=number(5)-i(1); j++
			for(int j=1; j<=number-i; j++) {
				// 2번for문의 조건식이 true인동안 " "를 찍는다.
				System.out.print(" "); 
			}
			// 3번 for문 : j=1; j<=i(1); j++
			for(int j=1; j<=i; j++) {
				// 3번for문의 조건식이 true인 동안 "*"를 찍는다.
				System.out.print("*");
			}
			// 3번 for문이 끝나면 줄바꿈처리한다. 
			System.out.println();
		}
	}
}
