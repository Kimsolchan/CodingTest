package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_18108 {
	public static void main(String[] args) {
		// 불기와 서기는 543년의 차이가 있다.
		Scanner scanner = new Scanner(System.in);
		// 불기 입력
		int year = scanner.nextInt();
		// 불기 - 543 : 서기
		System.out.println(year - 543);
	}
}
