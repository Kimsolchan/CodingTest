package programmers.lv0;

public class Ex_181935 {
  public static int solution(int n) {
    int answer = 0;

    if(n % 2 == 0){
      // n = 짝수, 2~n이하의 모든 짝수들의 제곱의 합을 구한다.
      for(int i = 2; i<=n; i+=2){
        answer += i * i;
      }
    }else{
      // n = 홀수, 1~n이하의 모든 홀수들의 합을 구한다.
      for(int i = 1; i<=n; i+=2){
        answer += i;
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    int n = 10;

    System.out.println(solution(n));
  }
}
