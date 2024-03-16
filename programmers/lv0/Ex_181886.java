package programmers.lv0;

import java.util.stream.Stream;

public class Ex_181886 {
  public static String[] solution(String[] names) {
    String[] answer = new String [names.length / 5 + 1];

    for(int i = 0, j = 0; i<answer.length; i++, j+=5){
      answer[i] = names[j];
      System.out.println(answer[i]);
    }
    
    return answer;

    // return Stream.of(names).filter(names, index -> index % 5 == 0).toArray; ???
  }
  public static void main(String[] args) {
    String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};

    System.out.println(solution(names));
  }
}
