package BaekJoon.Step6;

import java.util.*;
import java.io.*;

public class Q2941 {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String s = br.readLine();
            // 크로아티아 알파벳에 해당하는 문자열
            String[] croatia = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

            for(String val : croatia) {
                //replace() : 문자열 안에서 특정 문자열을 다른 문자열로 바꿔주는 메소드
                s = s.replace(val, "A");
            }
            System.out.println(s.length());
        }
    }
