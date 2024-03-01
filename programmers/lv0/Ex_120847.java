package programmers.lv0;

import java.util.Arrays;

public class Ex_120847 {
  public static int solution(int[] numbers) {
    Arrays.sort(numbers);

    return numbers[numbers.length-1] * numbers[numbers.length - 2];
  }
  public static void main(String[] args) {
    int[] numbers = {0, 31, 24, 10, 1, 9};

    System.out.println(solution(numbers));
  }
}