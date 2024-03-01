package programmers.lv0;

import java.util.stream.IntStream;

public class Ex_120813 {
  public static int[] solution(int n){
    return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();
  }
  public static void main(String[] args) {
    int n = 10;

    System.out.println(solution(n));
  }
}
