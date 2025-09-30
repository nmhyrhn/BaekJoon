package BaekJoon.Step6;

import java.util.*;
import java.io.*;


public class Q1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String str = s.toUpperCase(); // 모두 대문자로 변경

        int[] count = new int[26]; //알파벳 갯수로 지정

        for (int i=0; i<str.length(); i++) {
            int num = str.charAt(i)-'A'; // 현재 문자를 'A'로부터의 오프셋(0~25)으로 변환
            count[num]++;                 // 해당 알파벳의 카운트를 1 증가
        }

        int max = 0; // 지금까지 찾은 최대 빈도수 저장 변수 (초기값 0)
        char answer = '?'; // 정답 문자 초기값은 '?' (동률 발생 시 사용

        for (int i=0; i<count.length; i++) { // A(0)부터 Z(25)까지 빈도 배열을 순회
            if (max < count[i]) {        // 발견한 빈도가 현재 최대보다 크면
                max = count[i];          // 최대값 갱신
                answer = (char) (i + 'A'); // 인덱스를 문자로 변환하여 정답으로 설정
            } else if (max == count[i]) { // 현재 빈도와 최대가 같으면 (동률)
                answer = '?';            // 동률이므로 정답을 '?'로 설정ㅍ
            }
        }
        System.out.print(answer)  ;
    }
}
