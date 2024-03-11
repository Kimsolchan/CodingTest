package programmers.lv0;

public class Ex_181936 {
  public static int solution(int number, int n, int m) {
    return number % n == 0 && number % m == 0? 1 : 0;
  }
}
