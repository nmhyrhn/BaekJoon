package BaekJoon.A;

import java.io.*;

public class Q2744 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isUpperCase(c)) {
                //대문자 > 소문자
                sb.append(Character.toLowerCase(c));
            } else {
                //소문자 > 대문자
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print(sb);
    }
}
