package programmers.lv0;

public class Ex_120807 {
	public static int solution(int num1, int num2) {
	    return num1 == num2? 1 : -1;
	}

	public static void main(String[] args) {
		int num1 = 2, num2 = 3;
		
		System.out.println(solution(num1, num2));
	}
}
