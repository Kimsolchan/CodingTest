package programmers.lv0;

public class Ex_120809 {
  public static int[] solution(int[] numbers) {
    for(int i = 0; i < numbers.length; i++){
      numbers[i] *=2;
   }
   return numbers;
}

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5};

    System.out.println(solution(numbers));
  }
}
