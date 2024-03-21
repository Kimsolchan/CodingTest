package programmers.lv0;

public class Ex_181888 {
  public static int[] solution(int[] num_list, int n) {
    int len = num_list.length % n == 0? num_list.length / n : num_list.length / n + 1;

    int[] answer = new int[len];

    for(int i = 0, j = 0; i<len; i++, j+=n){
      answer[i] = num_list[j];
    }

    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {4, 2, 6, 1, 7, 6};
    int n = 4;

    System.out.println(solution(num_list, n));
  }
}
