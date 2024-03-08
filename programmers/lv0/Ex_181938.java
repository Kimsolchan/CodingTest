package programmers.lv0;

public class Ex_181938 {
  public static int solution(int a, int b) {
    int num1 = Integer.parseInt(a + "" + b);
    int num2 = 2 * a * b;
    int result = 0;

    if (num1 > num2 || num1 == num2) {
      result = num1;
    }else {
      result = num2;
    }

    return result;
}
  public static void main(String[] args) {
    int a = 91, b = 2;

    System.out.println(solution(a, b));
  }
}
