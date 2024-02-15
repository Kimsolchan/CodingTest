package programmers.lv0;

public class Ex_120830 {
  public static int solution(int n, int k){
    return n * 12000 + k * 2000 - (n/10)*2000;
  }

  public static void main(String[] args) {
    int n = 10, k = 3;

    System.out.println(solution(n, k));
  }
}
