package programmers.lv0;

public class Ex_181920 {
  public static int[] solution(int start_num, int end_num) {
    int[] answer = new int[end_num - start_num +1];

    for(int i = 0; i<answer.length; i++){
      answer[i] = start_num++;
    }

    return answer;
  }
  public static void main(String[] args) {
    int start_num = 3, end_num = 10;

    System.out.println(solution(start_num, end_num));
  }
}
