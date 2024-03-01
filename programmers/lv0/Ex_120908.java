package programmers.lv0;

public class Ex_120908 {
  public static int solution(String str1, String str2) {
    return str1.contains(str2)? 1 : 2;
  }

  public static void main(String[] args) {
    String str1 = "ab6CDE443fgh22iJKlmn1o", str2 = "6CD";

    System.out.println(solution(str1, str2));
  }
}
