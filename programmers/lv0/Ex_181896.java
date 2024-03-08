package programmers.lv0;

public class Ex_181896 {
  public static int solution(int[] num_list) {
    for(int i = 0; i<num_list.length; i++){
        if(num_list[i] < 0){
            return i;
        }
    }
    
    return -1;
  }
  public static void main(String[] args) {
    int[] num_list = {1, 2, 3, -4, 5};

    System.out.println(solution(num_list));
  }
}
