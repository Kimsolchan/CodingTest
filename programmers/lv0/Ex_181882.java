package programmers.lv0;

public class Ex_181882 {
  public static int[] solution(int[] arr) {
    int idx = 0;
    
    for(int i : arr){
        arr[idx++] = i >= 50 && i % 2 == 0? i / 2 : i < 50 && i % 2 == 1 ? i * 2 : i;
    }
    
    return arr;
}
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 100, 99, 98};

    System.out.println(solution(arr));
  }
}
