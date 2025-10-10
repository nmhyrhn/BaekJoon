package BaekJoon.보라매컵_5회;

import java.util.*;

//문제
//입소 순서대로 아래 규칙에 따라 중대와 소대에 배정
//1중대 1소대부터 한 소대가 꽉 차면 다음 소대로 이동
//한 중대의 마지막 소대까지 채워지면, 다음 중대로 이동한
//각 소대에는 정확히 n명의 훈련병이 배정
//전체는 a개의 중대, 각 중대는 b개의 소대로 이루어짐

//입력 : 정수 a, b, n, k
//a: 중대 수 / b: 각 중대의 소대 수
//n: 한 소대의 인원 수 / k: 하늘이의 입소 순서
//(1 ≤ a, b, n ≤ 10, 1 ≤ k ≤ a × b × n)

//출력
//하늘이가 배정된 중대 번호 i와 소대 번호 j를 출력한다.
//즉, “i중대 j소대” 형태로 출력.

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // 중대 수
        int b = sc.nextInt(); // 각 중대의 소대 수
        int n = sc.nextInt(); // 각 소대의 훈련병 수
        int k = sc.nextInt(); // 하늘이의 입소 순서

        int p = k - 1;        // 0-based 인덱스로 변환
        int pl = p / n;       // 몇 번째 소대인지 (0-based)
        int i = pl / b + 1;   // 중대 번호 (1-based)
        int j = pl % b + 1;   // 소대 번호 (1-based)

        System.out.println(i + " " + j);
    }
}
