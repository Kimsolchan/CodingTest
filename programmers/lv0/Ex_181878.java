package programmers.lv0;

public class Ex_181878 {
  public static int solution(String myString, String pat) {
    myString = myString.toUpperCase();
    pat = pat.toUpperCase();

    return myString.length() < pat.length()? 0 : myString.contains(pat)? 1 : 0;
  }

  public static void main(String[] args) {
    String myString = "AbCdEfG";
    String pat = "aBc";

    System.out.println(solution(myString, pat));
  }
}
