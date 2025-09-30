package BaekJoon.Step4;

import java.util.*;

public class Q5597 {
    public static void main(String[] args) {

        int[] arr = new int[30];
        //문제 내에 학생 수 30명 제시됨

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<28; i++) {
            // 제출자 28명으로 범위 지정
            int a = sc.nextInt();
            arr[a-1] = 1;
            //제출 학생 배열에서 해당 인덱스 1로 표시
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i]==0) {
                //해당 인덱스에 값이 1이 아닌경우 찾기 , 미제출자
                System.out.println(i+=1);
                //인덱스+1은 실제 번호

                //인덱스는 0-29로 생성, 학생은 1-30으로 지정됨
            }
        }


    }
}
