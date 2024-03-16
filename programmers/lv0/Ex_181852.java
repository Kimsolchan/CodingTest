package programmers.lv0;

import java.util.Arrays;

public class Ex_181852 {
  public static int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length - 5];

    Arrays.sort(num_list);

    for(int i = 0, j = 5; i<answer.length; i++, j++){
      answer[i] = num_list[j];
    }

    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

    System.out.println(solution(num_list));
  }
}
