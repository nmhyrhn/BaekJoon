package BaekJoon.A;

import java.util.*;
import java.lang.*;
import java.io.*;

class Q5532 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 총 방학 일수
        int A = sc.nextInt(); // 풀어야 할 국어의 총 페이지
        int B = sc.nextInt(); // 풀어야 할 수학의 총 페이지
        int C = sc.nextInt(); // 하루에 국어 풀 수 있는 양
        int D = sc.nextInt(); // 하루에 수학 풀 수 있는 양
        sc.close();

        int kor = 0;
        int math = 0;

        // 놀 수 있는 날 구하기

        if (A % C == 0) {
            kor = L - (A / C);
        } else {
            kor = L - (A / C + 1);
        }

        if (B % D == 0) {
            math = L - (B / D);
        } else {
            math = L - (B / D + 1);
        }

        System.out.println(Math.min(kor, math));
    }
}