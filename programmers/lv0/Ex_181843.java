package programmers.lv0;

public class Ex_181843 {
  public static int solution(String my_string, String target) {
    return my_string.contains(target)? 1 : 0;
  }
  public static void main(String[] args) {
    String my_string = "banana", target = "ana";

    System.out.println(solution(my_string, target));
  }
}
