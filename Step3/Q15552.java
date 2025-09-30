package BaekJoon.Step3;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.StringTokenizer;
//입력 문자열을 공백 단위로 쪼개는 데 사용

public class Q15552 {
        public static void main(String[] args) throws IOException {
            // buffer를 사용하기 위해선 예외처리를 해야함 IOException 입출력예외로 던져버림?
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //Scanner와 동일하게 콘솔로 값을 받음?   = BufferedReader 단 애가 더 빠름
            //BufferedReader > 변환된 문자 스트림을 버퍼링(저장공간)해서 더 빠르게 읽을 수 있게 함
            //InputStreamReader > 바이트스트림을 문자스트림으로 변환 ??????
            StringBuilder sb = new StringBuilder();
            //StringBuilder > 문자열을 효율적으로 이어 붙이는 클래스
            //StringBuilder에 결과를 모아두었다가 마지막에 한 번만 출력

            int n = Integer.parseInt(br.readLine());
            //br.redaLine()으로 받은 문자열을 정수 n으로 형변환 시킴
            //br.readLine() > 입력 한 줄을 문자열(String)로 읽음
            //Integer.parseInt() > 문자열을 정수(int)로 변환
            //→ 즉, 첫 줄에 입력되는 "테스트 케이스 개수"를 정수 n에 저장

            for (int i = 0; i < n; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                //br.readLine() : 한 줄 입력 받음 (예: "1 2")
                //StringTokenizer : 공백을 기준으로 문자열을 잘라서 토큰 단위로 관리
                //→ "1"과 "2" 두 개의 토큰이 생김
                int a = Integer.parseInt(st.nextToken());
                //a값을 nexttoken으로 받아 정수로 형변환 함
                //st.nextToken() > 잘려진 문자열 중 첫 번째("1")를 꺼냄
                //Integer.parseInt() > 문자열 "1"을 정수 1로 변환 → a에 저장
                int b = Integer.parseInt(st.nextToken());
                //b값을 nexttoken으로 받아 정수로 형변환 함
                //st.nextToken() > 두 번째 토큰("2")을 꺼냄
                //Integer.parseInt() > 문자열 "2"를 정수 2로 변환 → b에 저장
                sb.append(a + b).append('\n');
                //sb.append() > StringBuilder에 문자열 추가
                //.append('\n') > 줄바꿈 문자 추가
                //→ 한 줄씩 결과를 누적해서 저장
            }

            System.out.print(sb.toString());
            //sb.toString() : StringBuilder에 누적된 문자열을 한꺼번에 문자열로 변환
            //System.out.print() : 한 번에 모든 결과를 출력
            //→ 성능이 매우 빠름 (println을 매번 쓰는 것보다 효율적)
        }
}
