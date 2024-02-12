package programmers.lv0;

public class Ex_120817 {
	public static double solution(int numbers[], int numbers_len) {
		int sum = 0;

		for (int i = 0; i < numbers_len; i++) {
			sum += numbers[i];
		}
		return (double) sum / numbers_len;
	}

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int numbers_len = numbers.length;
		
		System.out.println(solution(numbers, numbers_len));
	}
}
