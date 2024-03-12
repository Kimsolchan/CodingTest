package programmers.lv0;

public class Ex_181842 {
  public static int solution(String str1, String str2) {
    return str2.contains(str1)? 1 : 0;
  }
  public static void main(String[] args) {
    String str1 = "abc", str2 = "aabcc";
    
    System.out.println(solution(str1, str2));
  }
}
