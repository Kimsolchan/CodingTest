package programmers.lv0;

public class Ex_120836 {
  public static int solution(int n){
    int count = 0;

    for(int i = 1; i<=n; i++){
      if(n % i == 0){
        count++;
      }
    }

    return count;
  }
  public static void main(String[] args) {
    int n = 100;

    System.out.println(solution(n));
  }
}
