package BaekJoon.A;

import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Q10039 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i=0; i<5; i++) {
            int a = sc.nextInt();
            if (a > 40) {
                sum += a;
            }else {
                sum += 40;
            }
        }
        System.out.println(sum/5);


    }
}