import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {   // 입력이 더 이상 없을 때까지 반복
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
