package programmers.lv0;

public class Ex_120583 {
	public static int solution(int array[], int n) {
		int count = 0;

		for (int i = 0; i < array.length-1; i++) {
			if (n == array[i]) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 5 };
		int n = 1;
		
		System.out.println(solution(array, n));
	}
}
