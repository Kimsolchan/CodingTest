package codingtest.baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex_9086 {
	public static void main(String[] args) throws IOException {
		// 요구사항
		// 1. 단어를 t번 입력한다.
		// 2. 입력한 단어들의 첫글자와 끝 글자를 출력한다.
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		// 문자열 입력 횟수
//		int t = sc.nextInt();
		// 1. 배열의 인덱스 번호를 이용해서 문자들을 더하자!
//		String[] sArr = new String[t];
		
		// 2. for문을 이용해서 문자를 입력하고,
		// 입력한 문자를 배열에 담고, 인덱스 번호를 이용해 더한다.
//		for(int i=0; i<t; i++) {
//		while (t-- > 0) {
		for (;t-- > 0;) {
			String w = br.readLine();
//			String w = sc.next(); // 문자 입력
//			sArr = w.split(""); // split으로 쪼갠 단어들을 배열에 넣는다.
			// 배열의 첫 번째 요소 + 배열의 마지막 요소를 더한다.
//			System.out.println(sArr[0] + sArr[sArr.length-1]);
			System.out.println(w.charAt(0) +""+ w.charAt(w.length() -1 ));
		}		
	}
}
