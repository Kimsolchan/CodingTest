package programmers.lv0;

public class Ex_181933 {
  public static int solution(int a, int b, boolean flag) {
    return flag == true? a + b : a - b;
  }
  public static void main(String[] args) {
    int a = -4, b = 7; 
    boolean flag = true;

    System.out.println(solution(a, b, flag));
  }
}
