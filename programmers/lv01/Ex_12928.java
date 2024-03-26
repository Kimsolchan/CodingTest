package programmers.lv01;

public class Ex_12928 {
  public static int solution(int n) {
    int sum = 0, i = 1;

    while (i <= n) {
      if (n / 2 < i) {
        sum += n;
        break;
      } else if (n % i == 0) {
        sum += i;
      }
      i++;
    }

    return sum;
  }
  public static void main(String[] args) {
    int n = 12;

    System.out.println(solution(n));
  }
}
