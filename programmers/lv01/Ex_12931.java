package programmers.lv01;

public class Ex_12931 {
  public static int solution(int n) {
    int sum = 0;

    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }

    return sum;
  }

  public static void main(String[] args) {
    int n = 6;
    System.out.println(solution(n));
  }
}
