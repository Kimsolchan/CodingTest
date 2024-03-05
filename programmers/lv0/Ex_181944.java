package programmers.lv0;

import java.util.Scanner;

public class Ex_181944 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(n + (n % 2 == 0? " is even" : " is odd"));
    }
}
