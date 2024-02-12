package programmers.lv0;

public class Ex_120816 {
	public static int solution01(int slice, int n) {
		return n % slice == 0? n / slice : n / slice + 1;
	} 
	
	public static int solution02(int slice, int n) {
        return (int) Math.ceil((double) n / slice);
	} 
	
	public static void main(String[] args) {
		int slice = 7, n = 10;
		
		System.out.println(solution01(slice, n));
		System.out.println(solution02(slice, n));
	}
}
