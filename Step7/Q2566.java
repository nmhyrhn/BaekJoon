package BaekJoon.Step7;

import java.io.*;

public class Q2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 빠른 표준 입력을 위해 사용
        int max = -1; // 최댓값을 저장할 변수(문제의 수는 0 이상이므로 -1로 초기화해도 안전)
        int maxRow = 0; // 최댓값의 행 번호(1부터 셀 것이므로 0으로 초기화)
        int maxCol = 0; // 최댓값의 열 번호(1부터 셀 것이므로 0으로 초기화)

        for (int i = 0; i < 9; i++) { // 9개의 행을 차례로 읽기 위한 반복문
            String line = br.readLine(); // 한 줄(한 행)에 있는 9개의 숫자를 문자열로 읽음
            String[] parts = line.split("\\s+"); // 공백(스페이스나 탭)으로 나누어 문자열 배열로 만듦
            for (int j = 0; j < 9; j++) { // 한 행의 9개 숫자를 하나씩 처리하기 위한 반복문
                int val = Integer.parseInt(parts [j]); // 문자열을 정수로 바꿔서 val에 저장
                if (val > max) { // 현재 값이 지금까지 기록한 최댓값보다 크면
                    max = val; // 최댓값을 현재 값으로 갱신
                    maxRow = i + 1; // 행 번호는 1부터이므로 i+1로 저장
                    maxCol = j + 1; // 열 번호도 1부터이므로 j+1로 저장
                } // if 끝
            } // inner for 끝
        } // outer for 끝

        System.out.println(max); // 최댓값을 출력
        System.out.println(maxRow + " " + maxCol); // 최댓값의 행과 열을 한 줄에 출력 (공백으로 구분)
    }
}
