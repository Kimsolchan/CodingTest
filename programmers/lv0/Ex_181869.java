package programmers.lv0;

public class Ex_181869 {
  public static String[] solution(String my_string) {
    return my_string.split(" ");
  }

  public static void main(String[] args) {
    String my_string = "i love you";
    System.out.println(solution(my_string));
  }
}
