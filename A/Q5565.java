package BaekJoon.A;

import java.util.Scanner;

public class Q5565 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tot = sc.nextInt(); // 총합 입력
        int sum = 0; // 합계를 누적할 변수 (for문 밖에 선언)

        for (int i = 0; i < 9; i++) {
            sum += sc.nextInt(); // 9개의 값 입력받아 누적
        }

        System.out.println(tot - sum); // 남은 값 출력
    }
}
