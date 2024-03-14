package programmers.lv0;

public class Ex_181926 {
  public static int solution(int n, String control) {
    String[] str = control.split("");

    for(String s : str){
      if(s.equals("w")){
        n += 1;
      }else if (s.equals("s")) {
        n -= 1;
      }else if (s.equals("d")) {
        n += 10;
      }else{
        n -= 10;
      }
    }

    return n;
}
  public static void main(String[] args) {
    int n = 0;
    String control = "wsdawsdassw";

    System.out.println(solution(n, control));
  }
}
