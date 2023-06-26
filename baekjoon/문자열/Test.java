package codingtest.baekjoon.문자열;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s= sc.nextLine().trim();
		System.out.println(s);
		String[] r = s.split(" ");
		int count = r.length;
//		if (r.length > 0) {
//			if (r[0].equals("")) {
//				count--;
//			}
//		}
		System.out.println(count);
		
//		String f = " a pple "; // -> "빈칸"a"빈칸"pple"빈칸"
////		String[] s = new String[5];
////		for(int i=0; i<s.length; i++) {
//			String[] s = f.split(" ");
////		}
//		
//		for(int i=0; i<s.length; i++) {
//			System.out.println("s[" + i+"] : " + s[i]);
//		}
	}
}
