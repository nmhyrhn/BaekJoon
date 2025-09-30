package BaekJoon.Step3;

import java.util.Scanner;

public class Q10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 배열 크기 입력
        int[] arr = new int[n];     // 배열 선언

        // 배열 입력 받기
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();       // 찾을 값 입력
        int count = 0;

        // 배열에서 v 개수 세기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                count++;
            }
        }

        System.out.print(count);
    }
}
