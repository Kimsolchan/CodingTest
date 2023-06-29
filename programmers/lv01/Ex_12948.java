package codingtest.programmers.lv01;

public class Ex_12948 {
	public static String solution(String phone_number) {
		String[] strArr = phone_number.split("");
		String answer = "";
		
		for(int i=strArr.length-5; i>=0; i--) {
			strArr[i] = "*";
		}
		
		for(int i=0; i<strArr.length; i++) {
			answer += strArr[i];
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String phone_number = "027778888"; // "027778888"
		System.out.println(solution(phone_number));
	}
}
