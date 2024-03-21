package programmers.lv0;

import java.util.stream.IntStream;

public class Ex_181888 {
  public static int[] solution(int[] num_list, int n) {
    // int len = num_list.length % n == 0? num_list.length / n : num_list.length / n + 1;

    // int[] answer = new int[len];

    // for(int i = 0, j = 0; i<len; i++, j+=n){
    //   answer[i] = num_list[j];
    // }
    
    // ex : int[] num_list = {4, 2, 6, 1, 7, 6};, n =4 
    // IntStream.range(0, num_list.length) : 0 ~ 배열의 길이까지 순회할 범위를 설정한다.
    // filter(i -> i % n == 0) : 인트스트림안에 모든요소에 대해서 n으로 나누어 떨어지는 수만 남기겠다.(0, 4)
    // map(i -> num_list[i]) : IntStream안에 남은 요소(i)를 num_list[i]로 치환한다. num_list[0], num_list[4]
    // map에 의해서 IntStream에는 4,7이 남는다. 남은 요소들을 기본형의 새로운 배열로 만든다. 
    return IntStream.range(0, num_list.length).filter(i -> i % n == 0).map(i -> num_list[i]).toArray();
  }
  public static void main(String[] args) {
    int[] num_list = {4, 2, 6, 1, 7, 6};
    int n = 4;

    System.out.println(solution(num_list, n));
  }
}
