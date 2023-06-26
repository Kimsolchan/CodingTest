package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number; // 별찍기를 몇 번 반복할 것인지 입력
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) { // 1번 for문 : n번만큼 반복 ex) i=1;
			for(int j=1; j<=i; j++) { // 2번 for문 : j=1; j<=1; j++
				System.out.print("*"); // 증감식의 결과가 true인 동안 "*"을 찍는다.
			}
			System.out.println(); // 2번 for문이 끝나면 줄바꿈처리
		}	
	}
}
