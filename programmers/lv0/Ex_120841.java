package programmers.lv0;

public class Ex_120841 {
  public static int solution(int[] dot){
    int x = dot[0] , y = dot[1];

    return x > 0 ? y > 0 ? 1 : 4: y>0? 2 : 3;
  }

  public static void main(String[] args) {
    int[] dot = {2, 4};

    System.out.println(solution(dot));
  }
}
