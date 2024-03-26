package programmers.lv0;

public class Ex_181856 {
  public static int solution(int[] arr1, int[] arr2) {
    int sum1 = 0, sum2 = 0;

    if (arr1.length < arr2.length) {
      return -1;
    } else if (arr1.length > arr2.length) {
      return 1;
    } else {
      for (int i = 0, j = 0; i < arr1.length; i++, j++) {
        sum1 += arr1[i];
        sum2 += arr2[j];
      }

      if (sum1 > sum2) {
        return 1;
      } else if (sum1 == sum2) {
        return 0;
      } else {
        return -1;
      }
    }

  }

  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5 };
    int[] arr2 = { 3, 3, 3, 3, 3 };

    System.out.println(solution(arr1, arr2));
  }
}
