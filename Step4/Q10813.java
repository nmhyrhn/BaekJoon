import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
public class Q10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 첫 줄 입력 받아 공백 단위로 나눔

        int n = Integer.parseInt(st.nextToken());
        //바구니 개수
        int m = Integer.parseInt(st.nextToken());
        //교환 횟수

        int[] arr = new int[n+1];
        //인덱스를 1부터 사용라기 우해 n+1 지정
        for (int i = 1; i <= n; i++) {
            arr[i] = i;
        }
        for (int k = 1; k <= m; k++) {
            //m번에 걸쳐 교환 수행
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb);
    }

}