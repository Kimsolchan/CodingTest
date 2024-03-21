package programmers.lv0;

public class Ex_181910 {
  public static String solution(String my_string, int n) {
    return my_string.substring(my_string.length() - n);
  }
  public static void main(String[] args) {
    String my_string = "ProgrammerS123";
    int n = 11;

    System.out.println(solution(my_string, n));
  }
}
