package programmers.lv0;

public class Ex_181879 {
  public static int solution(int[] num_list) {
    int answer = 0;

    // 배열의 길이가 10이하면 모든 요소를 곱해야 하므로 answer = 1
    if (num_list.length <= 10) {answer = 1;}
    
    if(answer == 1){
      for(int i = 0; i<num_list.length; i++){
        answer *= num_list[i];
      }
    }else{
      for(int i = 0; i<num_list.length; i++){
        answer += num_list[i];
      }
    }

    return answer;
  }
  public static void main(String[] args) {
    int[] num_list = {2, 3, 4, 5};

    System.out.println(solution(num_list));
  }
}
