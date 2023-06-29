package codingtest.programmers.lv01;

public class Ex_12948 {
	public String solution(String phone_number) {
		// 1. 문자열을 쪼개고, String형 배열에 값 저장
		String[] strArr = phone_number.split("");
		String answer = "";
		
		// 2. 끝에서 5번째 요소 ~ 배열의 첫번째 요소까지 "*" 처리한다.
		//    -> int i = strArr.length - 5;
		for (int i = strArr.length - 5; i >= 0; i--) {
			strArr[i] = "*";
		}
		
		// 3. String형 변수에 배열의 모든 값을 더한다.
		for (int i = 0; i < strArr.length; i++) {
			answer += strArr[i];
		}

		return answer;
	}
}
