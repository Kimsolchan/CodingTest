package codingtest.programmers.lv01;

public class Ex_12943 {
	public static int solution(int num) {
		long answer = num;
		int cnt = 0;
		
		// 1. 주어진 수가 1이면
		if(answer == 1) {
			// 0을 반환한다.
			return cnt;
		}
		
		// answer이 1이 되면 while문 종료
		while(answer != 1) {
			// 2. cnt가 500이 되면
			if(cnt == 500) {
				// cnt = -1
				cnt = -1;
				// while문 종료
				break;
			}else {
				// 3. cnt가 500이 아니면 삼항연산자 조건 확인 
				// - answer이 짝수면 answer = answer/2
				// - answer이 홀수면 answer = (answer * 3) + 1
				answer = (answer % 2 == 0) ? answer /= 2 : (answer * 3) + 1;
				// cnt값 1 증가
				cnt++;
			}
		}
		return cnt;
	}
}
