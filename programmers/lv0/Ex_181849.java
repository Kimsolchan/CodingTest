package programmers.lv0;

public class Ex_181849 {
  public static int solution(String num_str) {
    int sum = 0;

    for (int i = 0; i < num_str.length(); i++) {
      sum += Integer.parseInt(Character.toString(num_str.charAt(i)));
    }
    return sum;
  }

  public static void main(String[] args) {
    String num_str = "123456789";

    System.out.println(solution(num_str));
  }
}
