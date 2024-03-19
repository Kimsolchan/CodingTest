package programmers.lv0;

public class Ex_181886 {
  public static String[] solution(String[] names) {
    // int len = (int)Math.ceil(names.length / 5.0);
    int len = names.length / 5 + (names.length % 5 == 0 ? 0 : 1);
     String[] answer = new String[len];
     
     for(int i = 0, j = 0; i<answer.length; i++, j+=5){
       answer[i] = names[j];
      }
      return answer;
  }
  public static void main(String[] args) {
    String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

    System.out.println(solution(names));
  }
}
