package programmers.lv0;

public class Ex_181892 {
  public static int[] solution(int[] num_list, int n) {
    int[] answer = new int[num_list.length - n + 1];
    
    for (int i = 0, j = n - 1; j < num_list.length; i++, j++) {
        answer[i] = num_list[j];
    }
    
    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {2, 1, 6};

    int n = 3;

    System.out.println(solution(num_list, n));
  }
}
