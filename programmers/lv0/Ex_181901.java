package programmers.lv0;

public class Ex_181901 {
  public static int[] solution(int n, int k) {
    int[] answer = new int[n / k];
        
    for(int i = 0, j = k; i < answer.length; i++){
        answer[i] =  j;
        j += k;
    }
    
    return answer;
  }
  public static void main(String[] args) {
    int n = 10, k = 3;

    System.out.println(solution(n, k));
  }
}
