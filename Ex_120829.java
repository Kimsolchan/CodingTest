package programmers.lv0;

public class Ex_120829 {
	public static int solution01(int angle) {
		return angle < 90? 1 : angle == 90? 2 : angle < 180? 3 : 4;
	}
	
	public static int solution02(int angle) {
		if(angle < 90) {
			return 1;
		}else if(angle == 90) {
			return 2;
		}else if(angle < 180) {
			return 3;
		}
		
		return 4;
	}
	
	public static void main(String[] args) {
		int angle = 70;
		
		System.out.println(solution01(angle));
		
		System.out.println(solution02(angle));
	}
}
