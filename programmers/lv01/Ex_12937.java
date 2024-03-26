package programmers.lv01;

public class Ex_12937 {
  public static String solution(int num) {
    return num % 2 == 0?"Even" : "Odd";
  }

  public static void main(String[] args) {
    int num = 3;
    System.out.println(solution(num));
  }
}
