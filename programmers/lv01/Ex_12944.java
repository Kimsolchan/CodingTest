package programmers.lv01;

public class Ex_12944 {
  public static double solution(int[] arr) {
    int count = 0;
    double sum = 0.0;

    for (int i : arr) {
      sum += i;
      count++;
    }

    return sum / count;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 5 };

    System.out.println(solution(arr));
  }
}
