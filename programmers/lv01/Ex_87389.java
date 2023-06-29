package codingtest.programmers.lv01;

class Ex_87389 {
    public int solution(int n) {
    	// n을 나눌 수
    	int number = 1;
    	// 나머지가 1이 되는 가장 작은 수
    	int min = 0;
 
    	while(true) {
    		// 1. n을 number로 나눈 나머지가 1이면
    		if(n % number == 1) {
    			// min(가장 작은 수) = number
    			min = number;
    			// while문 종료
    			break;
    	    // 조건1이 거짓이면(n을 number로 나눈 나머지가 0이 아니면)
    		}else {
    			// number값 1증가
    			number++;
    		}
    	}
        return min;
    }
}
