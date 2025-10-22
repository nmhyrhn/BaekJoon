package BaekJoon.A;

import java.util.*;

public class Q5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] burger = new int[3];//버거
        int[] drink = new int[2];//음료

        for (int i=0; i<3; i++) {
            burger[i] = sc.nextInt();
        }
        for (int j=0; j<2; j++) {
            drink[j] = sc.nextInt();
        }

        System.out.println(Math.min(burger[0], Math.min(burger[1], burger[2])) + Math.min(drink[0], drink[1]) - 50);



    }
}
