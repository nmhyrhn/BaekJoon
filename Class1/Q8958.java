package BaekJoon.Class1;

import java.util.*;

public class Q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strList=new String[sc.nextInt()];

        for (int i=0; i<strList.length; i++) {
            strList[i]=sc.next();}

        for(int j=0;j<strList.length;j++){
            int sum=0;
            int count=0;

            for(int k=0; k<strList[j].length();k++){
                if (strList[j].charAt(k) == 'O') {
                    count += 1;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
        }

    }
}
