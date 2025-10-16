package BaekJoon.A;

import java.util.Scanner;

public class Q17388 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        int sum = s+k+h;

        int min = Math.min(s,k);
        min = Math.min(min,h);

        if(sum >= 100) {
            System.out.println("OK");
        } else {
            if (min == s) {
                System.out.println("Soongsil");
            } else if (min == k) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
