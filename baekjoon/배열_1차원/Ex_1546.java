package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 요구사항 : 모든 점수를 점수/m*100
		// m(max) : 점수들중에 최댓값
		// n : 과목개수
		// ex : max : 70, 수학(math) : 50 -> 50/70*100 -> 71.43
		// n(3)
		// 40 80 60
		// 최댓값 : 80
		// 40/80*100 -> 50
		// 80/80*100 -> 100
		// 60/80*100 -> 75
		// 225 / 3 -> 75.0
		// 
		
		
		// 0.최댓값 변수 max 초가화
		int max=1;
		
		// 1. 과목개수 설정
		int subNumber = sc.nextInt();
		// 2. 과목별 점수를 담기 위한 배열 생성
		int[] subjectArr = new int[subNumber];
		// 3. for문으로 과목개수만큼 점수입력
		for(int i=0; i<subNumber; i++) {
			subjectArr[i] = sc.nextInt();
			// 4. 최댓값 재설정 : 가장 높은 시험점수
			if(max < subjectArr[i]) {
				max = subjectArr[i];
			}
		}
		
		// 5. 과목별 점수 수정
		// 평균을 구하기 위해 모든 점수를 더한 값을 저장할 sum변수 선언
		int sum = 0;
		for(int i=0; i<subNumber; i++) {
			// 점수/max*100
			subjectArr[i] = subjectArr[i]/max*100;
		}
		System.out.print(sum);
		
		// 6. 평균을 구한다.
		System.out.print((float)(sum/subNumber));
		
		
		
		int n = sc.nextInt(); // 과목개수
		int[] s = new int[n]; // 배열
		int m = 0; // 최대값
		double a = 0; // 합계 or 평균,실수변수
		for (int i =0  ;i < n; i++) {
			s[i] = sc.nextInt(); // 점수입력 
			if (s[i] > m) { // 최대값을 측정하는 if문
				m = s[i];
			}
			a += s[i]; //  a = a(double) + s[i](int) -> double;
		}
		a = a / m * 100 / n; // a = a / m *100/n
		System.out.println(a);
	}
}
