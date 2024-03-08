package programmers.lv0;

public class Ex_181938 {
  public static int solution(int a, int b) {
    int num1 = Integer.parseInt(a + "" + b);
    int num2 = 2 * a * b;

    return num1 >= num2 ? num1 : num2;
}
  public static void main(String[] args) {
    int a = 91, b = 2;

    System.out.println(solution(a, b));
  }
}
