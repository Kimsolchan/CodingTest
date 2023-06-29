package codingtest.programmers.lv01;

public class Test {
	public static void main(String[] args) {
		long l = 123456;
		String str = Long.toString(l);
		String[] strArr = str.split("");
		
		System.out.println("str : " + str);
		
		
		int[] intArr = new int[strArr.length];
		
		for(int i=0, j=intArr.length-1; j>=0; i++, j--) {
			intArr[i] = Integer.parseInt(strArr[j]);
		}
		
		for(int i=0; i < intArr.length; i++) {
			System.out.print(intArr[i]);
		}
	}
}
