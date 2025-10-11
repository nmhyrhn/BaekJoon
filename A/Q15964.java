package BaekJoon.A;

import java.util.Scanner;

public class Q15964 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long b = sc.nextInt();
        long result = 0;

        result = (a+b)*(a-b);



        System.out.println(result);
    }
}
