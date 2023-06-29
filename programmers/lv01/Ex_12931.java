package codingtest.programmers.lv01;

import java.util.*;

public class Ex_12931 {
	// 1. ex : int n = 123;
    public int solution(int n) {
        int answer = 0;
        
        // 2. while문은 n이 0이 되는 순간 종료
        while(n != 0){
        	// 3. answer = anwer + (n % 10)
        	//    answer = 3
            answer += n % 10;
            // 4. n = n / 10 -> n = 12
            n /= 10;
        }
        // 5. return answer(6)
        return answer;
    }
}
