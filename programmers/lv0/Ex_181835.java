package programmers.lv0;

public class Ex_181835 {
  public static int[] solution(int[] arr, int k) {
    // case01 : 가독성을 살린 코드
    // for(int i = 0; i<arr.length; i++){
    //    arr[i] = k % 2 == 0 ? arr[i] + k : arr[i] * k;
    //   }

    // case02 : 성능을 생각한 코드
    if(k % 2 == 0){
      for(int i = 0; i<arr.length; i++){
        arr[i] += k;
      }
    }else{
      for(int i = 0; i<arr.length; i++){
        arr[i] *= k;
      }
    }

    return arr;
  }
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 100, 99, 98};
    int k = 3;

    System.out.println(solution(arr, k));
  }
}
