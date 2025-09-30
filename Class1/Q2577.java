package BaekJoon.Class1;

import java.util.Scanner;

public class Q2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sum = a*b*c;

        int[] count = new int[10];

        // 결과를 문자열로 변환
        //다양한 타입의 값을 문자열로 바꿔주는 정적 메소드
        String str = String.valueOf(sum);

        // 각 문자(숫자)를 순회하며 개수 세기
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; // 문자 → 정수
            count[digit]++;
        }

        // 0부터 9까지 출력
        for (int i = 0; i < 10; i++) {
            System.out.println(count[i]);
        }
    }
}
