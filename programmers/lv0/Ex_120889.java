package programmers.lv0;

import java.util.Arrays;

public class Ex_120889 {
  public static int solution(int[] sides) {
    Arrays.sort(sides);
    int a = sides[0], b = sides[1], c = sides[2];
    return c < a + b? 1 : 2;
}
  public static void main(String[] args) {
    int[] sides = {3, 6, 2};

    System.out.println(solution(sides));
  }
}
