package BaekJoon.Class1;

import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (sc.hasNextInt()){
            //hasNestInt() 다음 입력이 정수형으로 읽을 수 있는지 검사
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a+b);
        }
    }
}
