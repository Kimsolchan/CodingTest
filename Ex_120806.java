package programmers.lv0;

public class Ex_120806 {
	public static int solution(int num1, int num2) {
		return (int)((float)num1 / num2 * 1000);
	}
	
	public static void main(String[] args) {
		int num1 = 3, num2 = 2;
		
		System.out.println(solution(num1, num2));
	}
}