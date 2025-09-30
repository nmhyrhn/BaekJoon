package BaekJoon.Class1;
import java.util.*;

public class Q27866 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //next는 공백 기준으로 문자열을 가져옴
        int n = sc.nextInt();

        System.out.println(str.charAt(n-1));
        //str의 문자열을 charAt을 통해가져옴 n-1은 인덱스 위치를 맞추기위함
    }
}
