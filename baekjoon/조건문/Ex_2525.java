package codingtest.baekjoon.조건문;

import java.util.Scanner;

public class Ex_2525 {
	public static void main(String[] args) {
		// ==오븐==
		// 1. 시간, 분 입력
		// 2. 요리할때 걸리는 시간(분)입력
		// 3. 결과 : 완성되는 시간,분 출력 
		
		Scanner sc = new Scanner(System.in);
		// 시간단위를 모두 분으로 통일하고 전부 더한다.
		// 모두 더한 분(m3)을 시간,분으로 나누어준다.
		// m3 / 60 -> t
		// t == 24 -> 0
		// m3 % 60 -> m
		int t, m1, m2, m3;
		t = sc.nextInt();
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = (t * 60) + m1 + m2;
		
		System.out.println(String.format("%d %d", (m3 / 60) % 24, m3 % 60)); 
	}
}
