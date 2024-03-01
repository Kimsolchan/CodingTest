package programmers.lv0;

public class Ex_120825 {
  public static String solution(String my_string, int n) {
    String[] strArr = my_string.split("");
    String result = "";

    for(int i = 0; i<strArr.length; i++){
      result += strArr[i].repeat(n);
    }

    return result;
  }
  public static void main(String[] args) {
    String my_String = "hello";
    int n = 3;

    System.out.println(solution(my_String, n));
  }
}
