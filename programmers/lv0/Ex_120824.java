package programmers.lv0;

public class Ex_120824 {
  public static int[] solution(int[] num_list) {
    int even = 0, odd = 0;
    
    for(int i = 0; i<num_list.length; i++){
        if(num_list[i] % 2 == 0){
            even++;
        }else{
            odd++;
        }
    }
    
    return new int[] {even, odd};
}
  public static void main(String[] args) {
    int[] num_list = {1, 2, 3, 4, 5};

    System.out.println(solution(num_list));
  }
}
