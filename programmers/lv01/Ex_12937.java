package codingtest.programmers.lv01;

public class Ex_12937 {
	public static String solution(int num) {
		String answer = (num % 2 == 0) ? "Odd" : "Even";
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(4));
	}
}
