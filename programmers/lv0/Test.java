package programmers.lv0;

public class Test {
  public static void main(String[] args) {
    // 등차수열(1~100까지 더하기)

    // case01 : for문으로 1~100까지 모두 더하기
    int case01 = 0;

    for(int i = 1; i<= 100; i++){
      case01 += i;
    }
    System.out.println("case01 : " + case01);

    // case02 : 등차수열 사용(start : 1 / End : 100, start는 1++, end는 1-- / end가 1이 될 때까지 i+j)
    int case02 = 0;
    for(int i = 100, j=1; i>= 1; i--, j++){
      case02 += i+j;
    }

    // 결과 / 2
    case02 /= 2;
    System.out.println("case02 : " + case02);
    
  }
}

// 1~10까지 3씩 증가하는 등차수열
// 1. (10+1) (7+3) (4+7) (1 + 10) 4세트의 식이 나왔다.
// 2. 세트를 2로 나눠준다. -> 2세트에서 모든 숫자를 숫자를 사용했기 때문이다. (1, 3, 7, 10)
// 3. 2로 나눠준 결과에서 다시 3으로 나눠준다. -> 3씩 증가했기 때문이다.(4씩 증가했다면 4로 나눠줘야 한다.)

// 1. 1
// 2. 1 + 3 = 4 
// 3. 4 + 3 = 7
// 4. 7 + 3 = 10
// 5. 10 + 3 = 13
// 6. 13 + 3 = 16
// 7. 16 + 3 = 19
// 8. 19 + 3 = 22
// 9. 22 + 3 = 25
// 10. 25 + 3 = 28     
