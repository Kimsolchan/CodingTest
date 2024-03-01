package programmers.lv0;

import java.util.ArrayList;
import java.util.List;

public class Ex_120813 {
  public static int[] solution(int n){
    List<Integer> list = new ArrayList<>();

    for(int i = 1; i<=n; i+=2){
      list.add(i);
    }

    int[] result = list.stream().mapToInt(i -> i).toArray();

    return result;
  }
  public static void main(String[] args) {
    int n = 10;

    System.out.println(solution(n));
  }
}
