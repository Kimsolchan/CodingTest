package codingtest.programmers.lv01;

public class Ex_12919 {
	public String solution(String[] seoul) {
		String answer = "";
		
		// 1. for문은 seoul에 길이만큼 반복한다.
		for(int i=0; i<seoul.length; i++) {
			// 2. seoul[i]인덱스 값이 "Kim"과 같다면
			if(seoul[i].equals("Kim")) {
				// anwer = 김서방은 i(인덱스번호)에 있다
				answer = "김서방은 " + i + "에 있다";
				// 3. kim을 찾았다면 for문 종료 : 불필요한 탐색 제거
				break;
			}
		}
		return answer;
	}
}
