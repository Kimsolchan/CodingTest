package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Ex_27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 요구사항
		// 단어s와 정수i가 주어졌을 때 s의i번째 글자를 출력할것
		String s = sc.next(); // 단어
		int i = sc.nextInt(); // 단어의 인덱스
		
		// String 배열에 s.split("");으로 단어를쪼개서 배열에 저장 
		String[] sArr = s.split("");
		
		// String배열에 인덱스번호-1 호출
		System.out.println(sArr[i-1]);
		// time : 10minute
	}
}
