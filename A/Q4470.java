package BaekJoon.A;

import java.util.*;

public class Q4470 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < N; i++) {

            System.out.println((i + 1) + ". " + scan.nextLine());
        }

        scan.close();
    }
}
