package codingtest.baekjoon.배열_1차원;

import java.util.Scanner;

public class Ex_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = 0; // 찾으려는 정수의 개수 
        int n = sc.nextInt(); // 정수의 개수
        
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
        	arr[i] = sc.nextInt(); // 배열인덱스에 각각 들어갈 정수들
        }

        int v = sc.nextInt(); // 찾으려는 정수

        for(int i = 0; i < arr.length; i++) {
            if (v == arr[i]){ // v == arr[i] -> true면 
                count++; // count값 1증가
            }
        }

        System.out.println(count);
	}
}
