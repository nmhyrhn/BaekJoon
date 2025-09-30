package BaekJoon.Class1;

import java.util.*;

public class Q11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String num = sc.next();

        int sum = 0;


        for (int i = 0; i < a; i++) {


            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);

    }
}
