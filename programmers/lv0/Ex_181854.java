package programmers.lv0;

public class Ex_181854 {
  public static int[] solution(int[] arr, int n) {
    int idx = arr.length % 2 == 1 ? 0 : 1;

    for (; idx < arr.length; idx += 2) {
      arr[idx] += n;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 49, 12, 100, 276, 33 };
    int n = 27;

    System.out.println(solution(arr, n));
  }
}
