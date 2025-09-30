package BaekJoon.Step5;

import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        sc.close();

        String str1;
        String str2;

        //Character.toString는 문자열을 문자로 변환, 단 문자를 문자열로 변환도 가능함
        str1 = Character.toString(a.charAt(2)) +
                Character.toString(a.charAt(1)) +
                Character.toString(a.charAt(0));

        str2 = Character.toString(b.charAt(2)) +
                Character.toString(b.charAt(1)) +
                Character.toString(b.charAt(0));

        //문자열을 정수로 변환
        if(Integer.parseInt(str1) > Integer.parseInt(str2)) {
            System.out.println(str1);
        } else {
            System.out.println(str2);
        }
    }
}


//Scanner sc = new Scanner(System.in);
//
//String n = sc.next();
//String m = sc.next();
//
//String n_2 ="";
//String m_2 ="";
//
//        for(int i=n.length()-1;i>=0;i--){
//n_2+=n.charAt(i);
//m_2+=m.charAt(i);
//        }
//
//                if(Integer.parseInt(n_2)>Integer.parseInt(m_2)){
//        System.out.println(n_2);
//        }else{
//                System.out.println(m_2);
//        }

////도은 풀이 2
//Scanner sc = new Scanner(System.in);
//
//String[] n = sc.next().split("");
//String[] m = sc.next().split("");
////빈문자열이지만 배열 하나를 반환해줌
//
//
//        for (int i = 2; i >= 0; i--) {
//        if(Integer.parseInt(n[i])>Integer.parseInt(m[i])){
//        for (int j = 2; j >= 0; j--){
//        System.out.print(n[j]);
//                    }
//                            break;
//
//       }else  if(Integer.parseInt(m[i])>Integer.parseInt(n[i])){
//        for (int k = 2; k >= 0; k--){
//        System.out.print(m[k]);
//                    }
//                            break;
//                            }
//                            }
