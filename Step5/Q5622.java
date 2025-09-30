package BaekJoon.Step5;

import java.util.Scanner;

public class Q5622 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String word = sc.nextLine(); // 문자열 입력
    int sum = 0;

    for(int i = 0; i < word.length(); i++){
        char ch = word.charAt(i);
        switch(ch){
            case 'A': case 'B': case 'C':
                sum += 3; break; // 2번 → 3초
            case 'D': case 'E': case 'F':
                sum += 4; break; // 3번 → 4초
            case 'G': case 'H': case 'I':
                sum += 5; break; // 4번 → 5초
            case 'J': case 'K': case 'L':
                sum += 6; break; // 5번 → 6초
            case 'M': case 'N': case 'O':
                sum += 7; break; // 6번 → 7초
            case 'P': case 'Q': case 'R': case 'S':
                sum += 8; break; // 7번 → 8초
            case 'T': case 'U': case 'V':
                sum += 9; break; // 8번 → 9초
            case 'W': case 'X': case 'Y': case 'Z':
                sum += 10; break; // 9번 → 10초
        }
    }

    System.out.println(sum);

}
}
