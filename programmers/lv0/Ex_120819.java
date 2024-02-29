package programmers.lv0;

public class Ex_120819 {
  public static int[] solution(int money) {
    int[] answer = new int[2];
    
    answer[0] = money / 5500;
    answer[1] = money % 5500;
    
    return answer;
  }

  public static void main(String[] args) {
    int money = 4400;
    System.out.println(solution(money));
  }
}
