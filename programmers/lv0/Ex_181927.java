package programmers.lv0;

public class Ex_181927 {
  public static int[] solution(int[] num_list) {
    // 마지막 원소 > 뒤에서 두번째 원소 = 마지막원소 + 뒤에서 두 번째 원소
    // 마지막 원소 <= 뒤에서 두번째 원소 = 마지막 원소 * 2
    int[] answer = new int[num_list.length + 1];
    
    // 마지막 원소 값
    int nLast = num_list[num_list.length - 1];
    // 뒤에서 두 번째 원소 값
    int nLast2 = num_list[num_list.length - 2];
    
    int idx = 0;
    
    // answer의 마지막 원소전까지는 기존 원소의 모든 요소를 answer에 할당한다.
    for(; idx<num_list.length; idx++){
        answer[idx] = num_list[idx];
    }
    
    // answr의 마지막 요소는 두 가지 조건에 결과에 따라 달라진다.
    answer[idx] = nLast > nLast2 ? nLast - nLast2 : nLast * 2;
    
    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {2, 1, 5};

    System.out.println(solution(num_list));
  }
}
