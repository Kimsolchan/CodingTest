package codingtest.baekjoon.반복문;

import java.util.Scanner;

public class Ex_25314 {
	public static void main(String[] args) {
		// long int -> 4byte
		// long long int -> 8byte
		Scanner sc = new Scanner(System.in);
		
		int longNumber = sc.nextInt();
		String str = "";
		
		// 풀이과정 참고하여 해결
		for(int i = 1; i<=longNumber/4; i++) {
			str += "long ";
		}
		System.out.print(str + "int");
	}
}
