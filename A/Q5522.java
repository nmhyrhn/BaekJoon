package BaekJoon.A;

import java.util.Scanner;

public class Q5522 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i=0; i<5; i++) {
            int a = sc.nextInt();
            sum += a;
        }

        System.out.print(sum);
    }
}
