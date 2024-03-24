package programmers.lv0;

public class Ex_181874 {
  public static String solution(String myString) {
    String answer = "";

    String[] str = myString.split("");

    for (String s : str) {
      if (s.equals("a")) {
        answer += s.toUpperCase();
      } else {
        answer += s.toLowerCase();
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    String myString = "abstract algebra";

    System.out.println(solution(myString));
  }
}
