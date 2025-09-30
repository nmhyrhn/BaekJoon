package BaekJoon.Class1;

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            int h = sc.nextInt();
            //층수를 의미
            int w = sc.nextInt();
            //층당 방 수
            int n = sc.nextInt();
            //몇 번째 손님

            // 손님 번호 n이 층 수 h로 나누어 떨어지는 경우 → 마지막 층에 배정
            if(n % h == 0) {
                // 층: h, 호실 번호: n/h
                // 예: h=6, n=12 → 602호
                System.out.println((h * 100) + (n / h));
            } else {
                // 나누어떨어지지 않는 경우
                // 층: n % h, 호실 번호: n/h + 1
                // 예: h=6, n=10 → 402호
                System.out.println(((n % h) * 100) + ((n / h) + 1));
            }
        }
    }
}
