package programmers.lv0;

public class Ex_120906 {
  public static int solution(int n){
    int result = 0;

    while(n > 0){
      result += n % 10;
      n /= 10;
    }

    return result;
  }
  public static void main(String[] args) {
    int n = 1234;

    System.out.println(solution(n));
  }
}
