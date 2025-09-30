package BaekJoon.Step5;

import java.util.*;

public class Q9086 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i=0; i<a; i++) {
            String s = sc.next();
            //charAt(n) 문자열에서 n번째 있는 문자를 가져옴
            System.out.print(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
        }


    }
}
