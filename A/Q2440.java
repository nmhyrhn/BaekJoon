package BaekJoon.A;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Q2440 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}