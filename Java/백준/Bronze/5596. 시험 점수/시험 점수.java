import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int[] b = new int[4];

        for (int i=0; i<4; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<4; i++) {
            b[i] = sc.nextInt();
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i=0;i<4;i++) {
            sum1 += a[i];
            sum2 += b[i];
        }

        
        System.out.print(Math.max(sum1,sum2));
    }
}