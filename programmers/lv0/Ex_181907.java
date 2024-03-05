package programmers.lv0;

public class Ex_181907 {
  public static String solution(String my_String, int n){
    return my_String.substring(0, n);
  }
  public static void main(String[] args) {
    String myString = "He110W0r1d";
    int n = 5;

    System.out.println(solution(myString, n));
  }
}
