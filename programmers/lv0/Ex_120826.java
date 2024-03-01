package programmers.lv0;

public class Ex_120826 {
  public static String solution(String my_string, String letter){
    return my_string.replace(letter, "");
  }
  public static void main(String[] args) {
    String my_string = "abcdef", letter = "f";
    
    System.out.println(solution(my_string, letter));
  }
}
