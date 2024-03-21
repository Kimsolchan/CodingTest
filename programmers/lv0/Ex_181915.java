package programmers.lv0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex_181915 {
  public static String solution(String my_string, int[] index_list) {
    // StringBuilder answer = new StringBuilder();

    // for(int i = 0; i<index_list.length; i++){
    //   answer.append(my_string.charAt(index_list[i]));
    // }

    // return answer.toString();
    
    // IntStream.of(index_list) : index_list의 모든 요소들이 IntStream의 형태로 순회할 준비를 한다.

    // mapToObj(i -> Character.toString(my_string.charAt(i)))
    // mapToObj : IntStream의 각 요소들의 기본타입인 int를 객체로 변환한다.
    // i -> Character.toString(my_string.charAt(i)) : my_string의 i번째 문자를 받아와서 문자열로 변환해준다.
    // collect(Collectors.joining("")) : IntStream형태로 시작해서 Stream형태의 모든 요소들을 ""기준으로 묶어준다.
    return IntStream.of(index_list).mapToObj(i -> Character.toString(my_string.charAt(i))).collect(Collectors.joining(""));
  }
  public static void main(String[] args) {
    String my_string = "cvsgiorszzzmrpaqpe";
    int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

    System.out.println(solution(my_string, index_list));
  }
}
