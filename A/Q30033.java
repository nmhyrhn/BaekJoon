package BaekJoon.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q30033 {
    public static void main(String[] args) throws IOException{
        // BufferedReader를 이용하여 입력을 빠르게 읽음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 첫 번째 줄 입력: 계획한 공부 일수 n
        int n = Integer.parseInt(br.readLine());

        // 2. 계획 페이지 수를 저장할 배열 생성
        int[] arr = new int[n];

        // 3. 두 번째 줄 입력: 계획한 페이지 수
        // StringTokenizer를 이용하여 공백으로 구분된 정수 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 배열에 저장
        }

        // 4. 계획 이상으로 공부한 횟수를 저장할 변수
        int answer = 0;

        // 5. 세 번째 줄 입력: 실제 공부한 페이지 수
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            // 실제 공부한 페이지가 계획 페이지 이상이면 answer 증가
            if(arr[i] <= Integer.parseInt(st.nextToken())) {
                answer++;
            }
        }

        // 6. 결과 출력: 계획 이상으로 공부한 횟수
        System.out.print(answer);
    }
}
