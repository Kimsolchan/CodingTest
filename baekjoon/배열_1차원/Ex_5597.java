package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean[] arr = new boolean[30]; // boolean인 이유 : true/false로 제출/미제출을 가려낸다.
		for (int i = 0 ; i<28;i++) {
			int t = sc.nextInt(); // ex : 3
			arr[t- 1] = true; // arr[2] : 3 = true(제출완료);
		}
		for (int i = 0; i < 30;i++) {
			if (!arr[i]) { // 미제출자의 인덱스 번호 확인 ex : !arr[2] : 3
				System.out.println(i + 1); // 학생번호 출력 : 3번학생이 제출을 안했다.
			}
		}	
	}
}
