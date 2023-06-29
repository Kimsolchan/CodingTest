package codingtest.programmers.lv01;

public class Ex_12928 {
    public int solution(int n) {
    	// n을 나눌 약수
        int number = 1;
		int answer = 0;
		
		// for문은 i가 n과 같거나 작을때까지 반복한다.
		// number은 for문이 한번 반복할 때마다 1씩 증가한다.
		for(int i=1; i<=n; i++, number++) {
			// 1. n을 number로 나눴을 때 나머지가 0이면
			if(n % number == 0) {
				// 2. answer = answer + number;
				answer += number;
			}
		}
        return answer;
    }        
}