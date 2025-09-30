package BaekJoon.Class1;

import java.util.Scanner;

public class Q1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count =  0;
        while(sc.hasNext()) {
            //읽을 단어가 있는 지 확인
            sc.next(); // 단어 읽기
            count++;
        }

        System.out.println(count);


    }
}
