package BaekJoon.Step2;

import java.util.Scanner;

public class Q2480 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = 0;

        if (a==b && b==c) {
            System.out.print(sum = 10000 + a * 1000);
        } else if (a==b || a==c) {
            System.out.print(sum = 1000 + a * 100);
        } else if (b==c) {
            System.out.print(sum = 1000 + b * 100);
        } else if (a>b && a>c) {
            System.out.print(sum = a * 100);
        } else if (b>a && b>c) {
            System.out.print(sum = b * 100);
        } else {
            System.out.print(sum = c * 100);
        }

    }
}
