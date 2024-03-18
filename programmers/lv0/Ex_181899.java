package programmers.lv0;

public class Ex_181899 {
  public static int[] solution(int start_num, int end_num) {
    int[] answer = new int [start_num - end_num + 1];
        
    for(int i = start_num, j = 0; i>=end_num; i--, j++){
        answer[j] =  i;
    }
    
    return answer;
  }
  public static void main(String[] args) {
    int start_num = 10, end_num = 3;

    System.out.println(solution(start_num, end_num));
  }
}
