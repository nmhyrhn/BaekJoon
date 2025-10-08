package BaekJoon.A;

import java.util.*;

public class Q2742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = n;

        for (int i=0; i<n; i++) {
            System.out.println(a);
            a--;
        }
    }
}
