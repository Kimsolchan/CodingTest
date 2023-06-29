package codingtest.programmers.lv01;

public class Ex_12928 {
    public int solution(int n) {
    	// n을 나눌 약수
        int number = 1;
		int answer = 0;
        
        while(true){
        	// 1. number가 n보다 크면 
            if(number > n){
            	// while문 종료
                break;
            // 2. 조건1의 결과가 거짓이고,
            //	  n % number == 0이면
            }else if(n % number == 0){
            	// answer = answer + number;
                answer += number;
                // number값 1증가
                number++;
            // 3. 조건2의 결과가 거짓이면    
            }else{
            	// number값 1증가
                number ++;
            }
        }
        return answer;
    }        
}