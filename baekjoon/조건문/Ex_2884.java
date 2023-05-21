package codingtest.baekjoon.조건문;

import java.util.Scanner;

public class Ex_2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int time,minute;
		time = sc.nextInt();
		minute = sc.nextInt();
		
		if(minute >= 45 ) {
			minute -= 45;
		}else if(time > 0 && minute < 45) {
			time -= 1;
			minute = minute + (60 - 45);
		}else if(time == 0 && minute < 45) {
			time = 23;
			minute = minute + (60 - 45);
		}

		System.out.print(time + " " + minute);
	}
}
