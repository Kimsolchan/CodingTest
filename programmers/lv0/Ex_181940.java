package programmers.lv0;

public class Ex_181940 {
  public static String solution(String my_string, int k) {
    return my_string.repeat(k);
  }
  public static void main(String[] args) {
    String my_string = "string";
    int k = 2;

    System.out.println(solution(my_string, k));
  }
}
