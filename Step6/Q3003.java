package BaekJoon.Step6;

import  java.util.Scanner;

public class Q3003 {  public static void main(String[] args) {
    // 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
    Scanner sc = new Scanner(System.in);
    //배열로 받아서 인덱스 순으로 비교해준다
    //비교해서 +- 값을 다른 배열에 저장해서 출력
    int chess[] = {1,1,2,2,2,8};
    int a[] = new int[6];

    for (int i=0; i<chess.length; i++) {
        a[i] = sc.nextInt();
    }
    for(int j=0; j<a.length; j++) {
        System.out.print(chess[j]-a[j]+" ");
    }

}

}
