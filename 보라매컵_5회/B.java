package BaekJoon.보라매컵_5회;

import java.io.*;
import java.util.*;

//문제
//문자열 S는 군(G)과 꺾(K)으로 구성
//초기 값: x = 0
//문자열을 순서대로 읽으며 연산:
//G: x = x + 1
//K: x = x / 2
//모든 문자를 처리한 후의 x가 복무율(a/b)이 됨
//입력
//두 정수 a, b (1 ≤ a < b ≤ 10^9, 서로소)
//기약분수 a/b를 표현하려고 한다.

//출력
//a/b를 표현하는 가장 짧은 군꺾문자열 출력
//여러 개면 사전순으로 가장 빠른 것
//불가능하면 -1
//문자열 규칙: 군 → G / 꺾 → K

//제한 조건
//b는 반드시 2의 거듭제곱이어야 가능
//연산 과정에서 분수는 항상 기약분수
//최단 문자열 + 사전순 최소 조건 충족 필요

//예제 1
//입력:1 4 / 출력:GKK
//예제 2
//입력:5 7 / 출력:-1

public class B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (!(a == 0 && b == 1)) {
            if (a > b) {              // 역연산 G
                a -= b;
                sb.append('G');
            }
            else if (a < b) {         // 역연산 K
                if (b % 2 != 0) {     // 홀수면 나눌 수 없음
                    System.out.println(-1);
                    return;
                }
                b /= 2;
                sb.append('K');
            }
            else { // a == b 인 경우 불가능
                System.out.println(-1);
                return;
            }
        }

        // 거꾸로 만들어진 문자열을 뒤집어서 출력
        System.out.println(sb.reverse().toString());
    }
}