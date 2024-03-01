package programmers.lv0;

import java.util.Arrays;

public class Ex_120811 {
  public static int solution(int[] array) {
        Arrays.sort(array);
        
        return array[array.length / 2];
    }
    public static void main(String[] args) {
      int[] array = {9, -1, 0};

      System.out.println(solution(array));
    }
}
