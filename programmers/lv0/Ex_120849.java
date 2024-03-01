package programmers.lv0;

public class Ex_120849 {
  public static String solution(String my_string) {
    // return my_string.replaceAll("[aeiouAEIOU]", ""); // [안에 있는 형태의 문자들을 대상으로 한다]

    String[] strArr = {"a", "e", "i", "o", "u"};

    for(String word : strArr){
      if(my_string.contains(word)) {
          my_string = my_string.replace(word, "");
      }
  }
  
  return my_string;
  }

  public static void main(String[] args) {
    String my_String = "nice to meet you";

    System.out.println(solution(my_String));
  }
}
