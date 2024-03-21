package programmers.lv0;

public class Ex_181884 {
  public static int solution(int[] numbers, int n) {
    int answer = 0, i = 0;

    while(answer <= n){
      answer += numbers[i++];
    }

    return answer;
}
  public static void main(String[] args) {
    int[] numbers = {34, 5, 71, 29, 100, 34};
    int n = 123;

    System.out.println(solution(numbers, n));
  }
}
