package programmers.lv0;

public class Ex_120839 {
  public String solution(String rsp) {
    String answer = "";
    return answer;
  }
  public static void main(String[] args) {
    // 가위 : 2 바위 : 0 보 : 5 
    String rsp = "2";

    String[] str = rsp.split("");
    StringBuilder sb = new StringBuilder();

    for(String s : str){
      sb.append(s.equals("2")? "0" : s.equals("0")? "5" : s.equals("5")? "2" : "");
    }

    System.out.println(sb.toString());


  }
}
