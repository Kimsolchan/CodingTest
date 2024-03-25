package programmers.lv0;

public class Ex_120892 {
  public static String solution(String cipher, int code) {
    String[] str = cipher.split("");
    StringBuilder sb = new StringBuilder();
    
    for(int i = code-1;  i<str.length; i += code){
        sb.append(cipher.charAt(i));
    }
    
    return sb.toString();
  }
  public static void main(String[] args) {
    String cipher = "dfjardstddetckdaccccdegk";
    int code = 4;

    System.out.println(solution(cipher, code));
  }
}
