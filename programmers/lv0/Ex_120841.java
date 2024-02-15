package programmers.lv0;

public class Ex_120841 {
  public static int solution(int[] dot){
    int x = dot[0] , y = dot[1];

    if(x > 0 && y > 0){
      return 1;
    }else if (x < 0 && y > 0) {
      return 2;
    }else if (x < 0 && y <0) {
      return 3;
    }

    return 4;
  }

  public static void main(String[] args) {
    int[] dot = {2, 4};

    System.out.println(solution(dot));
  }
}
