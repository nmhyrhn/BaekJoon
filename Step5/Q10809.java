package BaekJoon.Step5;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int[] arr = new int[26];
        //a~z = 26

        for (int i=0; i<26; i++) {
            arr[i] = -1;
            //배열을 모두 -1로 초기화
        }

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            //문자열에서 i번째 추출

            // 만약 해당 알파벳이 처음 등장한 경우에만 기록
            if(arr[ch-97] == -1) {             // 'a'의 아스키 코드가 97 → 'a'는 인덱스 0, 'b'는 1 ...
                arr[ch-97] = i;                // 해당 알파벳의 인덱스 위치에 처음 등장한 자리(i) 저장
            }
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}


//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.next();
//
//          indexOf() > 인자로 전달된 String의 index 리턴, String 못 찾으면 -1 리턴
//        for (char c='a'; c<='z'; c++) {
            //a~z까지 반복
//            System.out.print(str.indexOf(c)+" ");
//        }
