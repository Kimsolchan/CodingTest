package programmers.lv0;

public class Ex_120583 {
	public static int solution(int array[], int array_len, int n) {
		// array_len은 배열 array의 길이입니다.
		int count = 0;

		for (int i = 0; i < array_len; i++) {
			if (n == array[i]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 5 };
		int n = 1;
		int array_len = array.length;
		
		System.out.println(solution(array, array_len, array_len));
	}
}
