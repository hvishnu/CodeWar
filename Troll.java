package com.codewar;

import java.util.Scanner;

public class Troll {
        public static void disemvowel(String str) {
            StringBuilder takes=new StringBuilder("");

            char[] takeit=str.toCharArray();
            for (int i=0;i<takeit.length;i++){
                if(takeit[i]=='a'||takeit[i]=='A'||takeit[i]=='o'||takeit[i]=='O'||takeit[i]=='I'||takeit[i]=='i'||takeit[i]=='e'||takeit[i]=='E'
                        ||takeit[i]=='u'||takeit[i]=='U'){
                    continue;
                }else{
                    takes.append(takeit[i]);
                }
            }
            System.out.println(takes);
            return ;
        }

        public static void main(String args[]){

            Scanner sc=new Scanner(System.in);
            String take=sc.next();
            disemvowel(take);


        }
    }

