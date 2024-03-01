package programmers.lv0;

public class Ex_120836 {
  public static int solution(int n){
    if (n == 1 || n == 2) {
      return n;
    }
    int count = 2;
    for(int i = 2; i<=n / 2; i++){
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
