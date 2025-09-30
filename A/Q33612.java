package BaekJoon.A;

import java.util.*;

public class Q33612 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 2024;
        int month = 8;

        int n = sc.nextInt();

        if (n ==1) {
            System.out.println(year + " " + month);
        } else {
            month += (7 * (n-1));

            if (month % 12 != 0) {
                year += month / 12;
                month = month % 12;
            } else {
                year += month / 12 -1;
                month = 12;
            }
            System.out.println(year + " " + month);
        }
    }
}
