package BaekJoon.A;

import java.util.*;

public class Q4101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break; // 입력 종료
            }

            if (a > b) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
