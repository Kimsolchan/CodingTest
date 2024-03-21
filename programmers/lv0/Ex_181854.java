package programmers.lv0;

import java.util.stream.IntStream;

public class Ex_181854 {
  public static int[] solution(int[] arr, int n) {
    // int idx = arr.length % 2 == 1 ? 0 : 1;

    // for (; idx < arr.length; idx += 2) {
    //   arr[idx] += n;
    // }
    // return arr;

    // boolean isEven = 배열의 길이 / 2의 나머지가 0이면 true, 0이 아니면 false
    boolean isEven = arr.length % 2 == 0;

    // IntStream.range(0, arr.length) : IntStream의 형태로 변환, 범위 0~배열의 길이
    // map(i -> arr[i] + (isEven && arr[i] % 2 == 1 || !isEven && arr[i] % 2 == 0 ? n : 0))
    // 왼쪽 i를 오른쪽 결과로 바꾼다.
    // arr[i]번째 요소값 + (배열 길이 : 짝수 && 인덱스 : 홀수 || 배열길이 : 홀수 && 인덱스 : 짝수? n : 0)
    // toArray() : 일반배열로 생성
    return IntStream.range(0, arr.length).map(i -> arr[i] + (isEven && i % 2 == 1 || !isEven && i % 2 == 0 ? n : 0)).toArray();
  } 

  public static void main(String[] args) {
    int[] arr = { 49, 12, 100, 276, 33 };
    int n = 27;

    System.out.println(solution(arr, n));
  }
}
