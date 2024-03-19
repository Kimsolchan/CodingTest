package programmers.lv0;

import java.util.Arrays;

public class Ex_181853 {
  public static int[] solution(int[] num_list) {
    int[] answer = new int[4];

    Arrays.sort(num_list);

    for(int i = 0; i<answer.length; i++){
      answer[i] = num_list[i];
    }

    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {12, 4, 15, 46, 38, 1, 14};

    System.out.println(solution(num_list));
  }
}
