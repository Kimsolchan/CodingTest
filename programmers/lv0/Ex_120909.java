package programmers.lv0;

public class Ex_120909 { // n이 제곱수면 1 아니면 2 return
  public static  int solution(int n) {
    if (n == 1) {return 1;}

    int num = (int) Math.sqrt(n);

    return num * num == n? 1 : 2;
}
  public static void main(String[] args) {
    int n = 5;
    
    System.out.println(solution(n));
  }
}
