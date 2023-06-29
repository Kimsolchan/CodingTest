package codingtest.programmers.lv01;

public class Ex_12937 {
    public String solution(int num) {
    	// answer = 조건(num % 2 == 0)의 결과가 true면 "Even" / false면 "Odd"
        String answer = (num % 2 == 0) ? "Even" : "Odd";
        return answer;
    }
}
