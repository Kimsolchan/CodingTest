package programmers.lv0;

public class Ex_181939 {
  public static int solution(int a, int b) {
    StringBuilder sb01 = new StringBuilder();
    StringBuilder sb02 = new StringBuilder();

    // "991"
    sb01.append(a);
    sb01.append(b);

    // "919"
    sb02.append(b);
    sb02.append(a);

    int n1 = Integer.parseInt(sb01.toString());
    int n2 = Integer.parseInt(sb02.toString());

    return n1 > n2? n1 : n2;
  }

  public static void main(String[] args) {
    int a = 9, b = 91;

    System.err.println(solution(a, b));
  }
}
