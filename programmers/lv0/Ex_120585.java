package programmers.lv0;

import java.util.stream.IntStream;

public class Ex_120585 {
	public static int solution01(int array[], int array_len, int height) {
	    int count = 0;
	    
	    for(int i=0; i<array_len; i++){
	        if(height < array[i]){
	            count++;
	        }
	    }
	    
	    return count;
	}
	
	public static int solution02(int array[], int array_len, int height) {
		return (int) IntStream.of(array).filter(i -> i > height).count();
	}

	public static void main(String[] args) {
		int[] array = { 149, 180, 192, 170 };
		int array_len = array.length, height = 167;
		
		System.out.println(solution01(array, array_len, height));
		
		System.out.println(solution02(array, array_len, height));
	}
}
