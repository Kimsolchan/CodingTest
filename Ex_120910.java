package programmers.lv0;

public class Ex_120910 {
	public static int solution(int n, int t) {
		for(int i=1; i<=t; i++) {
			n *= 2;
		}
		
		return n;
	}
	
	public static void main(String[] args) {
		int n = 2, t = 10;
		
		System.out.println(solution(n, t));
	}
}
