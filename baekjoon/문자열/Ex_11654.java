package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Ex_11654 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 요구사항 : 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때,
		//		   주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성
		
		// 1.입력한 문자를 변수에 저장한다.
		// - 
		char input = sc.next().charAt(0);
		int result = (int)input;
		
		System.out.println(result);
		
		
	}
}
