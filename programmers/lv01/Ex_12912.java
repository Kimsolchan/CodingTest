package codingtest.programmers.lv01;

public class Ex_12912 {
	public long solution(int a, int b) {
		long answer = 0;
		// a가 b보다 클 경우 두 수를 바꾸기 위한 임의변수
		int c = 0;

		// 1. a가 b 보다 크다면
		if (a > b) {
			// a 와 b를 바꾼다.(a < b)
			c = b;
			b = a;
			a = c;
		}
		
		// 2. i=a , i가 b보다 같거나 작을때까지 반복
		for (int i = a; i <= b; i++) {
			// answer = answer + i;
			answer += i;
		}
		return answer;
	}
}
