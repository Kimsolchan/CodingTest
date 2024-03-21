package programmers.lv0;

public class Ex_181869 {
  public static String[] solution(String my_string) {
    String[] str;

    if (my_string.contains(" ")) {
      str = my_string.split(" ");
    } else {
      str = new String[1];
      str[0] = my_string;
    }

    return str;
  }

  public static void main(String[] args) {
    String my_string = "i love you";
    System.out.println(solution(my_string));
  }
}
