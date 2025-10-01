package BaekJoon.Step6;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // boolean[26] 배열을 사용해서 이미 나온 알파벳인지 체크
        // 이전 문자와 다른데 이미 나온 알파벳이 다시 나오면 그룹 단어가 아님
        // 조건을 만족하면 count++ 해서 최종 출력

        // 단어의 개수 입력받기
        int n = sc.nextInt();
        int count = 0; // 그룹 단어의 개수를 저장할 변수

        // n개의 단어를 하나씩 검사
        for (int i = 0; i < n; i++) {
            String str = sc.next(); // 단어 입력받기
            boolean[] arr = new boolean[26];
            // 알파벳의 등장 여부를 기록하는 배열
            // (예: arr[0] = 'a', arr[25] = 'z')

            boolean check = true; // 해당 단어가 그룹 단어인지 확인하는 플래그

            // 단어의 문자들을 하나씩 확인
            for (int j = 0; j < str.length(); j++) {
                int ch = str.charAt(j) - 97;
                // 'a' 아스키코드(97)를 빼서 0~25 사이의 값으로 변환

                // 이미 나온 적 있는 문자라면
                if (arr[ch]) {
                    // 바로 직전 문자와 다르면 그룹 단어가 아님
                    // (ex: "abca" → 'a'가 떨어져서 다시 등장)
                    if (str.charAt(j) != str.charAt(j - 1)) {
                        check = false; // 그룹 단어 아님
                        break; // 더 이상 확인할 필요 없음 → 반복 종료
                    }
                } else {
                    // 처음 나온 문자라면 기록해두기
                    arr[ch] = true;
                }
            }

            // 그룹 단어라면 카운트 증가
            if (check) {
                count++;
            }
        }

        // 최종적으로 그룹 단어 개수 출력
        System.out.println(count);
    }
}
