package programmers.lv0;

public class Ex_120831 {
	public static int solution(int n) {
		int answer = 0;
		
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 10;
		
		System.out.println(solution(n));
	}
}
