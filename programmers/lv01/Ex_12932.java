package codingtest.programmers.lv01;

public class Ex_12932 {
    public int[] solution(long n) {
    	// 1. Long형을 String형으로 변환
        String str = Long.toString(n);
        
        // 2. str을 쪼개서 strArr에 저장
        String[] strArr = str.split("");
        
        // 3. int형 배열 answer의 길이 = strArr.length
        int[] answer = new int[strArr.length];
        
        // 4. 값을 거꾸로 저장하기위해 i=0, j=배열의길이-1;
        //    j가 0보다 같거나 클때까지 반복하며 반복할 때마다 i++, j--
        for(int i=0, j=answer.length-1; j>=0; i++, j--) {
        	// 배열의[i]번째 인덱스 = int형태로 타입변환(str[j]) 
            answer[i] = Integer.parseInt(strArr[j]);
        }
        return answer;
    }
}