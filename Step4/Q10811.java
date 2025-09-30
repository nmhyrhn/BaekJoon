package BaekJoon.Step4;

import  java.util.Scanner;
public class Q10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 바구니가 몇 개 있는지 입력받음
        int cnt = sc.nextInt(); // 바구니를 뒤집을 횟수를 입력받음

        int[] arr = new int[num+1];
        // 바구니 번호를 저장할 배열 만들기
        // 0번은 안쓰고 1번부터 쓰려고 +1

        for (int i=1; i<=num; i++) {
            arr[i] = i;
            // 바구니 번호를 순서대로 1,2,... 넣어줌
        }

        for (int k=0; k<cnt; k++) {
            // 뒤집는 작업을 cnt번 반복할 거예요
            int i = sc.nextInt(); // 뒤집기 시작할 바구니 번호
            int j = sc.nextInt(); // 뒤집기 끝나는 바구니 번호

            for (int h=i; h<=j; h++) {
                // i부터 j까지 바구니를 하나씩 뒤집기 시도
                int rev = j--;
                // j 위치부터 시작해서 하나씩 줄이면서 뒤집음
                // rev = 현재 뒤집을 위치

                int set = arr[h];
                // arr[h] 값을 잠시 set에 저장
                arr[h] = arr[rev];
                // arr[rev] 값을 arr[h]로 바꿔줌
                arr[rev] = set;
                // set에 저장해둔 값을 arr[rev]로 넣어 원래 값 교체
            }
        }

        for (int i=1; i<=num; i++) {
            System.out.print(arr[i] + " ");
            // 뒤집기 다 끝난 바구니 번호를 하나씩 출력
        }
    }
}
