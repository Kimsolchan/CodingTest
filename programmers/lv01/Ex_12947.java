package codingtest.programmers.lv01;

public class Ex_12947 {
	public static boolean solution(int x) {
		int sample = x;
		int number = x;
		int sum = 0;

		// sample가 0이 되면 while문 종료
		while (sample != 0) {
			// 1. sum = sum + sample % 10
			sum += sample % 10;
			// 2. sample = sample / 10;
			sample /= 10;
		}
		// 3. return number % sum == 0의 결과
		//    - 나누어 떨어지면 짝수므로 true / 아니면 false
		return number % sum == 0;
	}
}
