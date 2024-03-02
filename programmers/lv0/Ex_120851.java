package programmers.lv0;

public class Ex_120851 {
  public static int solution(String my_string) {
    int sum = 0;

    for(int i = 0; i<my_string.length(); i++){
      if (Character.isDigit(my_string.charAt(i))) {
        sum += Character.getNumericValue(my_string.charAt(i));
      }
    }

    return sum;
  }
  public static void main(String[] args) {
    String my_String = "a1b2c3";
    
    System.out.println(solution(my_String));
  }
}
