package BaekJoon.Step4;

import  java.util.*;

public class Q10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        //바구니 개수
        int n = sc.nextInt();
        //넣을 횟수
        int[] arr = new int[b];
        //바구니의 배열 arr[바구니개수]

        for (int i = 0; i < n; i++) {
            //넣을 횟수만큼 반복문 돌림
            int f = sc.nextInt();
            int s = sc.nextInt();
            int bn = sc.nextInt();

            for (int j = f - 1; j < s; j++) {
                //f-1은 인덱스값 조정, j<s까지 실행, 배열범위 지정
                arr[j] = bn;
                //배열 안에 bn값을 넣음
            }
        }
        for (int l = 0; l < b; l++) {
            //바구니 갯수까지만 반복문 돌림
            System.out.print(arr[l] + " ");
            //반복문 인덱스값 호출
        }
    }
}
