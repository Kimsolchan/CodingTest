package programmers.lv0;

public class Ex_120818 {
  // 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
	public static int solution(int price) {
    return price * (int)(1 - (price >= 500000? 0.2 : price >= 300000? 0.1 : price >= 100000?  0.05 : 0));
	}

	public static void main(String[] args) {
		int price = 580000;
		System.out.println(solution(price));
	}
}
