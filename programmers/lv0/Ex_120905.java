package programmers.lv0;

import java.util.stream.IntStream;

public class Ex_120905 {
  public static int[] solution(int n, int[] numlist) {

    // IntStream.of(numlist) : 배열을 IntStream으로 변환하고 배열의 요소를 순회할 준비를 한다.
    // filter(i-> i % n == 0) : 조건에 맞는 배열의 요소만 모은다. 
    // toArray() : filter를 통해 남겨진 배열의 요소들로 새로운 배열을 생성한다.(배열의 타입은 기본형으로 변환됨)
    return IntStream.of(numlist).filter(i-> i % n == 0).toArray();
  }
  public static void main(String[] args) {
    int n = 3;
    int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12,};

    System.out.println(solution(n, numlist));
  }
}
