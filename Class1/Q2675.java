package BaekJoon.Class1;

import java.util.*;

//2
//3 ABC
//5 /HTP

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        //테스트 케이스 입력받기
        for (int i=0; i<t; i++) {
            //테스트 케이스만큼 반복문 돌리기
            int n = sc.nextInt();
            String s = sc.next();
            //반복횟수와 문자열 받기

            for (int j=0; j<s.length(); j++ ) {
                //문자열 길이만큼 반복
                for (int k=0; k<n; k++) {
                    //반복횟수만큼 반복문 진행
                    System.out.print(s.charAt(j));
                    //charAt을 사용하여 문자 출력
                }
            }
            System.out.println();
        }

    }
}
