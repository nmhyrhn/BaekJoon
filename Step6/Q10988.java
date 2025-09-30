package BaekJoon.Step6;

import java.util.*;

public class Q10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        sc.close();
        int len = str.length();
        int ans = 1;

        StringBuilder sb = new StringBuilder(str);
        //StringBuilder 는 가변(mutable) 문자열을 제공해
        //문자열을 효율적으로 추가·수정·삭제할 수 있음
        sb.reverse();
        // 문자열을 뒤집음
        //문자열을 뒤집는 이유는 원래 문자열과 뒤집힌 문자열을 비교해,
        //앞뒤가 같은지(=회문인지) 확인하기 위해

        for(int i=0;i<len/2;i++) {
            if(str.charAt(i) != sb.charAt(i)) {
                ans = 0;
            }
        }
        System.out.println(ans);

//        Scanner sc = new Scanner(System.in);
//
//        // level, noon → 팰린드롬
//        // baekjoon, online, judge → 팰린드롬 아님
//        String str = sc.next();  // 문자열 입력
//        sc.close();
//
//        int count = 0;
//        int len = str.length();
//
//        // 앞뒤 문자 비교
//        for (int i = 0; i < len / 2; i++) {
//            if (str.charAt(i) == str.charAt(len - 1 - i)) {
//                count += 1;
//            } else {
//                break;
//            }
//        }
//
//        // 전부 같으면 1, 아니면 0 출력
//        if (count == len / 2) {
//            System.out.println(1);
//        } else {
//            System.out.println(0);
//        }


    }
}
