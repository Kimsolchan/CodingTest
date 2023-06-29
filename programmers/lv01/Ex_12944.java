package codingtest.programmers.lv01;

class Ex_12944 {
    public double solution(int[] arr) {
    	// 배열의 총합을 저장할 변수
        int sum = 0;
    	
    	for(int i=0; i<arr.length; i++) {
    		// sum = sum + arr[i]
    		sum += arr[i];
    	}
    	
    	// answer = (double(double값으로 형변환))sum / arr.length;
        double answer = (double)sum / arr.length;
        
        return answer;
    }
}
