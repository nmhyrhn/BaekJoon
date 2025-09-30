package BaekJoon.Class1;

import java.util.*;

public class Q10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i=0; i<a; i++) {
            arr[i] = sc.nextInt();
            //만들어둔 배열에 맞게 정수값을 받는다
        }

        Arrays.sort(arr);
        //만든 배열을 정렬한다
        System.out.print(arr[0]+" "+arr[a-1]);
        //최소값 배열[0] 인덱스 호출 arr[a-1]은 마지막 인덱스 호출
    }
}
