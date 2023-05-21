package codingtest.baekjoon.조건문;

import java.util.Scanner;

public class Ex_2525 {
	public static void main(String[] args) {
		// ==오븐==
		// 1. 시간, 분 입력
		// 2. 요리할때 걸리는 시간(분)입력
		// 3. 결과 : 완성되는 시간,분 출력 
		
		Scanner sc = new Scanner(System.in);
		int time, minute1, minute2, minute3;
		time = sc.nextInt(); // 현재시간(time)
		minute1 = sc.nextInt(); // 현재분(minute1)
		minute2 = sc.nextInt(); // 가공분(minute2)
		minute3 = minute1 + minute2; // 현재분 + 가공분 
		
		if(minute3 >= 60 && minute3 < 120) {
			time += 1;
			minute3 = minute3 - 60;
			if(time == 24) {
				time = 0;
			}
		}else if(minute3 >= 120) {
			time += 2;
			minute3 = minute3 - 120;
		}
		
		System.out.printf("%d %s",time, minute3);
	}
}
