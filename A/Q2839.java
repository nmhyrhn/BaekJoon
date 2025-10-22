package BaekJoon.A;

import java.util.*;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n ==4 || n == 7) {
            System.out.print(-1);
        } else if (n%5 ==0) {
            System.out.print(n/5);
        } else if (n%5 == 1 || n%5 == 3) {
            System.out.print((n/5)+1);
        } else {
            System.out.print((n/5)+2);
        }

    }
}
//
//Scanner sc = new Scanner(System.in);
//int n = sc.nextInt();
//
//int count = 0;
//
//        while (n >= 0) {
//        if (n % 5 == 0) {
//count += n / 5;
//        System.out.println(count);
//                return;
//                        }
//n -= 3;
//count++;
//        }
//        System.out.println(-1);
