package BaekJoon.Step2;

import  java.util.Scanner;

public class Q2884 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        m -= 45; //45분전 알림

        if (m < 0) { //45분전 알림으로 '-'해서 음수가 나올 경우
            m += 60; // 음수 + 60 하면 45분을 뺸 분이 나옴
            h -= 1; // 음수가 나오면 한시간전 이동으로 -1 해주기

            if (h < 0) { // 시간이 음수가 나오면
                h = 23; // 전날 23시로 지정
            }
        }
        System.out.println(h+" " +m);


    }
}
