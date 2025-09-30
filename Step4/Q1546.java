package BaekJoon.Step4;

import java.util.*;

public class Q1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[sc.nextInt()];
        //실수 배열로 콘솔값을 받는데 배열 범위를 정수값으로 받아준다

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextDouble();
            //배열 인덱스마다 실수값을 받는다
        }
        sc.close(); // 스캐너 닫아준다

        double sum = 0;
        Arrays.sort(arr); // 배열을 정렬한다, 최대값을 쉽게 찾기 위해서어

        for (int j=0; j<arr.length; j++) {
            sum += ((arr[j] / arr[arr.length-1]) * 100);
            // 각점수를 최대값으로 나눠준 후에 100을 곱한다
        }

        System.out.print(sum/arr.length);
        //합계를 배열 길이로 나눠준다

    }
}
