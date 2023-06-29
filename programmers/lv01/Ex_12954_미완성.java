package codingtest.programmers.lv01;

import java.util.*;

public class Ex_12954_미완성 {
	public static long[] solution(int x, int y) {
		long[] answer = new long[y];
		long cnt = 1;
		
		for(int i=0; i< answer.length; i++,cnt++) {
			answer[i] = x * cnt;
		}
		
		// 결과 : 배열의 메모리주소값이 나온다...
		return anwer;
	}

	public static void main(String[] args) {
		System.out.println(solution(2, 5));
	}
}
