package codingtest.baekjoon.배열_1차원;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[n];
		for (int i=1;i<=n;i++) {
			l[i - 1] = i;
		}
		
		for (int i = 0 ; i < m; i++) {
			int I = sc.nextInt() - 1; // 배열의 index번호 ex) 1:l[0] 3:l[2] 1:l[0]
			int J = sc.nextInt() - 1; // 배열의 index번호 ex) 2:l[1] 4:l[3] 4:l[3]
			int t; // 값을 바꿀때 필요한 임의변수
			while (I < J) {
				t = l[I]; // t=l[0]->1; t=l[2]->3;
				l[I++] = l[J]; // l[0]=l[1]->2 l[2]=l[3]->4
				l[J--] = t; // l[1]=t->1; l[3]=t->3; 
			}
		}
		System.out.println(Arrays.stream(l).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
	}
}
