package BaekJoon.A;

import java.util.*;

public class Q10768 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (a < 2 || (a == 2 && b < 18)) {
            System.out.println("Before");
        } else if (a > 2 || (a == 2 && b > 18)) {
            System.out.println("After");
        } else {
            System.out.println("Special");
        }
    }
}
