package codingtest.programmers.lv01;

import java.util.Arrays;
import java.util.Collections;

public class Ex_12933 {
	public long solution(long n) {
		long answer;
		
		// 1. long형을 String형으로 변환
		String str = Long.toString(n);
		
		// 2. split으로 문자열 쪼개서 배열에 저장
		String[] strArr = str.split("");
		
		// 3. 배열 내림차순 정렬
		Arrays.sort(strArr, Collections.reverseOrder());
		
		// 4. 쪼개진 문자열을 하나로 합칠 변수
		String sum = "";
		
		// 5. sum = sum + str[i];
		for(int i=0; i<strArr.length; i++) {
			sum += strArr[i];
		}
		
		// 6. String형 sum을 long타입으로 변환하여
		//    answer변수에 저장
		answer = Long.parseLong(sum);

		return answer;
	}
}
