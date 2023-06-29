package codingtest.programmers.lv01;

public class Ex_76501 {
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer=0;
		
		for(int i=0; i < signs.length; i++) {
			// 1. signs[i]가 true가 아니라면
			if(signs[i] != true) {
				// 2. absolutes[i]번째 인덱스 * -1-> 음수
				absolutes[i] *= -1;
			}
			// 3. answer = answer + absolutes[i]
			answer += absolutes[i];
		}
		return answer;
	}
}
