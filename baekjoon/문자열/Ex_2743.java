package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Ex_2743 {
	public static void main(String[] args) {
		// 요구사항
		// 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하라
		Scanner sc = new Scanner(System.in);
		
		String w = sc.next();
		
		String[] sArr = w.split("");
		// 문장길이를 담을 변수
		int count =0;
		
		// 배열의 길이만큼 반복하고, 반복할때마다 count++
		for(int i=0; i<sArr.length; i++) {
			count++;
		}
		
		System.out.println(count);	
		// time : 5minute
	}
}
