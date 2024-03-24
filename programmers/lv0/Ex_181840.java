package programmers.lv0;

public class Ex_181840 {
  public static int solution(int[] num_list, int n) {
    int answer = 0;

    for(int i : num_list){
      if(i == n){
        answer = 1;
        break;
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    int n = 3;

    int[] num_list = {1, 2, 3, 4, 5};

    System.out.println(solution(num_list, n));
  }
}
