package programmers.lv0;

public class Ex_120814 {
	public static int solution(int n) {
		return n % 7 == 0? n / 7 : n / 7 + 1;
	}
	
	public static void main(String[] args) {
		int n = 1;
		
		System.out.println(solution(n));
	}
}
