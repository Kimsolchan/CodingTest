package codingtest.baekjoon.조건문;

import java.util.Scanner;

public class Ex_2480 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2,num3,maxNum;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		maxNum = num1;
		if(maxNum < num2) {
			maxNum = num2;
		}
		
		if(maxNum < num3) {
			maxNum = num3;
		}
		
		if(num1 == num2 && num1 == num3 && num2 == num3) {
			System.out.println(10000 + (num1 * 1000));
		}else if(num1 == num2 || num1 == num3) {
			System.out.println(1000 + (num1 * 100));
		}else if(num2 == num3) {
			System.out.println(1000 + (num2 * 100));
		}else {
			System.out.println(maxNum * 100);
		}
	}
}
