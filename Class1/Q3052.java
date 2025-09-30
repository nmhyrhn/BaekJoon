package BaekJoon.Class1;

import java.util.*;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<Integer> set = new HashSet<>();
        //HashSet을 사용함<정수로만 받는걸로 지정> = HashSet<>() 객체 생성
        //HashSet을 사용하는 이유는 중복 제거임
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            //스캐너로 정수값 입력 받음
            set.add(num % 42);
            //나머지값을 셋에 저장시킴, 중복은 자동으로 제거됨
        }

        System.out.println(set.size());
        // 저장된 값의 갯수를 출력함
    }
}
