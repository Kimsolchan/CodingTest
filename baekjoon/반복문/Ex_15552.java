package codingtest.baekjoon.반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ex_15552 {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));// 선언
		
		//String s = bf.readLine(); // for문을 반복하는 횟수
		//Integer.parseInt(s); // 
		int num = Integer.parseInt(bf.readLine()); // for문을 반복할 횟수 // 5
		
		for (int i= 0 ;i < num; i++) {
			String s = bf.readLine();// 1 1
			StringTokenizer st = new StringTokenizer(s); //인자값에 입력문자열을 넣는다.
			// nextToken() : 공백위주로 문자열을 나눈다.
			bw.write((Integer.parseInt(st.nextToken())) + (Integer.parseInt(st.nextToken())) + "\n");
		}
		bw.flush(); // 버퍼안에 있는 찌꺼기를 다 출력한다(제거)
		bw.close(); // 버퍼종료
		bf.close(); // 버퍼종료	
	}
}
