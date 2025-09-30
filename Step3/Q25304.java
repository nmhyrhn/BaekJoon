package BaekJoon.Step3;

import java.util.Scanner;

public class Q25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();

        int tot = 0;

        for (int i = 1; i <= n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            tot += a*b;
        }

        if (sum == tot) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }
}
