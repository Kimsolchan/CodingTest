package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Ex_10809_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String txt = sc.next();
		
		int[] indexList = new int[26]; //a~z 까지 담겨있는 배열

		// long beforeTime = System.nanoTime();
		
		// indexList[0~25] : -1;
		for (int i = 0;i<indexList.length;i++) {
			indexList[i] = -1;
		}
		
		
		for (int i = 0 ; i < txt.length(); i++) {
			int c;
			char ch = txt.charAt(i);
			if (ch >= 97 && ch <= 122) {
				c = txt.charAt(i) - 97;
			} else {
				c = txt.charAt(i) - 65;
			}
			if (indexList[c] == -1) { 
				indexList[c] = i; 
			}
		}
		for (int i = 0;i<indexList.length;i++) {
			System.out.print(indexList[i] + " ");
		}
		
//		long afterTime = System.nanoTime();
//		long diff = (afterTime - beforeTime);
//		System.out.println("\nnanoSeconds: " + diff);
	}
}
