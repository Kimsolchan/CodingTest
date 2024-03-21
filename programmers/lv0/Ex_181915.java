package programmers.lv0;

public class Ex_181915 {
  public static String solution(String my_string, int[] index_list) {
    StringBuilder answer = new StringBuilder();

    for(int i = 0; i<index_list.length; i++){
      answer.append(my_string.charAt(index_list[i]));
    }

    return answer.toString();
  }
  public static void main(String[] args) {
    String my_string = "cvsgiorszzzmrpaqpe";
    int[] index_list = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};

    System.out.println(solution(my_string, index_list));
  }
}
