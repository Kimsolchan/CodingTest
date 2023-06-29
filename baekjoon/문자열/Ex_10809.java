package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Ex_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next(); // ex : apple
		
		String[] strArr = input.split("");
		// strArr[0] = 'a'
		// ...
		// strArr[4] = 'e'
		long beforeTime = System.nanoTime();
		char w = 97; // 찾으려는 문자 : a,b
		
		int index;
		do {
			index = -1;
			for (int i = 0 ;i < strArr.length; i++) {
				if((w + "").equals(strArr[i])) {
					index = i;
					break;
				}
			}
			System.out.print(index + " ");
		} while (w++ < 123);
		long afterTime = System.nanoTime();
		long diff = (afterTime - beforeTime);
		System.out.println("\nnanoSeconds: " + diff); // baekjoon -> 1622200
	}
}
