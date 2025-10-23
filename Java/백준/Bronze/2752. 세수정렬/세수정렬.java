import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a); // 오름차순 정렬

        for (int i = 0; i < 3; i++) {
            System.out.print(a[i]);
            if (i < 2) System.out.print(" "); // 마지막엔 공백 X
        }
    }
}
