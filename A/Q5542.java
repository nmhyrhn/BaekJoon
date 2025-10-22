package BaekJoon.A;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Q5542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] str = new String[n];

        for(int i=0; i<n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i=0; i<n; i++) {
            str[i] = str[i].toLowerCase();
            System.out.println(str[i]);
        }

    }
}
