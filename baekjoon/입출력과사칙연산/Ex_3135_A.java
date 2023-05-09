package codingtest.baekjoon.입출력과사칙연산;

import java.util.Scanner;

public class Ex_3135_A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,n, counter = 0, min;
		a = scanner.nextInt(); // 현재채널
		b = scanner.nextInt(); // 가야할 채널
		n = scanner.nextInt(); // 버튼개수
		min = Math.abs(a - b); // 최소거리 = 현재채널 - 가야할 채널
		for(int i = 0; i < n; i++) {
			int btn = scanner.nextInt(); // 즐겨찾기에 저장된 채널들
			if (Math.abs(btn - b) < min) { // 즐겨찾기에 저장된 채널 - 가야할 채널 < 최소거리
				counter = 1; // counter = 1 -> 즐겨찾기 버튼을 눌렀다., a에서 b로 그냥 가는거보다 빠르단 의미
				min = Math.abs(btn - b); // 최소거리 = 즐겨찾기채널 - 가야할 채널
			}
		}
		System.out.println(min + counter); // 최소거리 + 즐겨찾기 버튼 누른 회수
	}
}
