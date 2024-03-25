package programmers.lv0;

public class Ex_181873 {
  public static String solution(String my_string, String alp) {
    String[] str1 = my_string.split("");
    String answer = "";

    for (String s : str1) {
      if (s.equals(alp)) {
        s = s.toUpperCase();
      }
      answer += s;
    }

    return answer;
  }

  public static void main(String[] args) {
    String my_string = "programmers";
    String alp = "p";

    System.out.println(solution(my_string, alp));
  }
}
