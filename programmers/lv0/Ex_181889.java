package programmers.lv0;

public interface Ex_181889 {
  public static int[] solution(int[] num_list, int n) {
    int[] answer = new int[n];

    for(int i = 0; i<n; i++){
      answer[i] = num_list[i];
    }

    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {2, 1, 6};
    int n = 3;

    System.out.println(solution(num_list, n));
  }
}
