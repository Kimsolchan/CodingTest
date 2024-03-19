package programmers.lv0;

public class Ex_181928 {
  public static int solution(int[] num_list) {
    // int result = 0, odd = 1, even = 1;
    int result = 0;
    int[] digits = { 1, 1 };

    for (int i = num_list.length - 1; i >= 0; i--) {
      int n = num_list[i];
      int remain = n % 2;
      result += n * digits[remain];
      digits[remain] *= 10;
    }
    return result;
  }

  public static void main(String[] args) {
    int[] num_list = { 3, 4, 5, 2, 1 };

    System.out.println(solution(num_list));
  }
}
