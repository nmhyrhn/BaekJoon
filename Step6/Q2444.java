package BaekJoon.Step6;

import java.util.Scanner;

public class Q2444 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 위쪽 삼각형 (1줄 ~ N줄)
        for (int i = 1; i <= n; i++) {
            // 왼쪽 공백 출력 (n - i 개)
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            // 별 출력 (2*i - 1 개)
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");


            System.out.println();
        }

        // 아래쪽 삼각형 (N-1줄 ~ 1줄)
        for (int i = n - 1; i >= 1; i--) {
            // 왼쪽 공백 출력 (n - i 개)
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            // 별 출력 (2*i - 1 개)
            for (int j = 0; j < 2 * i - 1; j++)
                System.out.print("*");


            System.out.println();
        }
    }
}
