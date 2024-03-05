package programmers.lv0;

public class Ex_181889_f {
  public static int[] solution(int[] num_list, int n) {
    int[] answer = new int[4];

    return answer;
    
  }
  public static void main(String[] args) {
    int[] num_list = {5, 2, 1, 7, 5};
    int n = 3;

    int[] answer = new int[n];

    if (answer.length == 1) {
      answer[0] = num_list[0];
    }else{
      for(int i = 0; i<answer.length-1; i++){
        answer[i] = num_list[i];
      }
    }

    for(int i = 0; i<answer.length; i++){
      System.out.println(answer[i]);
    }

    // System.out.println(solution(num_list, n));
  }
}
