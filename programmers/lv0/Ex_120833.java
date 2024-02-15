package programmers.lv0;

public class Ex_120833 {
  public static int[] solution(int[] numbers, int num1, int num2){
    int[] answer = new int[num2 - num1+1];

    for(int i = num1, j = 0; i<=num2; i++, j++){
      answer[j] = answer[i];
    }

    return answer;
  }

  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    int num1 = 1, num2 = 3;

    System.out.println(solution(numbers, num1, num2));
  }
}
