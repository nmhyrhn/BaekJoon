package BaekJoon.Step2;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int cook = sc.nextInt();

        int total = (h * 60) + m + cook; //전체시간 분 환산

        //시 분으로 변환
        h = (total/60) % 24;
        m = total % 60;

        System.out.println(h + " " + m);
    }
}
