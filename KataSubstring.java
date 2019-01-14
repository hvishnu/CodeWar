package com.codewar;

//Find out the Length of the smallest substring in string

import java.io.StringReader;

public class KataSubstring {

    public static int findShort(String s) {
        int i=0,n=0;
        long take=10000000;
        s=s+" ";



        char[] rahul=s.toCharArray();

        for (int r:rahul) {
            if(r==32){
                if(n<take){
                    take=n;
                }
                n=0;
            }else {
                n++;
            }
        }
        System.out.println(take);
        return 0;

    }
    public static void main(String args[]){
        findShort("Tu g");
    }

}
