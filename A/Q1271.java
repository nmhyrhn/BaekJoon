package BaekJoon.A;

import java.io.*;
import java.util.*;
import java.math.*;

public class Q1271 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 입력 효율 위해 BufferedReader 사용 (System.in → InputStreamReader → BufferedReader)

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 공백 단위로 문자열을 나누어 토큰으로 관리하는 StringTokenizer 사용

        // n과 m 입력받기 (BigInteger는 int/long 범위를 초과하는 아주 큰 정수를 다루기 위해 사용)
        //자바의 int(약 21억), long(약 9경)보다 더 큰 수를 다루기 위한 클래스
        //java.math.BigInteger에서 제공됨
        //일반적인 +, -, *, /, % 연산자를 쓸 수 없고, 대신 메서드를 사용해야 함
        BigInteger n = new BigInteger(st.nextToken());  // 첫 번째 입력을 BigInteger로 변환 (총 돈)
        BigInteger m = new BigInteger(st.nextToken());  // 두 번째 입력을 BigInteger로 변환 (사람 수)

        // 몫과 나머지를 출력 (BigInteger는 산술 연산자가 아닌 메서드로 계산)
        System.out.print(n.divide(m) + "\n" + n.remainder(m));
        // divide(m) → n ÷ m (몫)
        // remainder(m) → n % m (나머지)
        // 출력 형식: 첫 줄에 몫, 둘째 줄에 나머지
    }
}
