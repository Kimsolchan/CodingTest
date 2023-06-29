package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Ex_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 테스트 횟수
		
		for(int i=0; i<n; i++) {
			int n1 =  sc.nextInt(); // 글자 반복 횟수
			String t1 = sc.next(); // 첫번째 테스트
			String[] strArr = t1.split("");
			for(int j=0; j<strArr.length; j++) { //			for(int j=0; j<n1; j++) {
				for (int k = 0 ; k< n1;k++) {
					System.out.print(strArr[j]);
				}
			}
			System.out.println();
		}
	}
}
