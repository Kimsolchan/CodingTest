package programmers.lv0;

public class Ex_181929 {
  public static int solution(int[] num_list) {
    int n1 = 1, n2 = 0;

    for (int n : num_list){
      n1 *= n;
      n2 += n;
    }

    return n1 < n2 * n2? 1 : 0;
  }
  public static void main(String[] args) {
    int[] num_list = {3, 4, 5, 2, 1};

    System.out.println(solution(num_list));
  }
} 