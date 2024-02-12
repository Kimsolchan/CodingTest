package programmers.lv0;

public class Ex_120821 {
	public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=0, j=num_list.length-1; i<num_list.length; i++,j--){
            answer[i] = num_list[j];
        }
        
        return answer;
	}
	
	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		
		System.out.println(solution(num_list));
	}
}
