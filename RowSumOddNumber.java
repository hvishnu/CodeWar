package com.codewar;

import java.util.Scanner;

//          1
//       3       5
//    7      9       11
//Sum of the row number of any column
 class RowSumOddNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rowSumOddNumbers(n);
    }


    public static int rowSumOddNumbers(int n) {
        System.out.println(n * n * n);
        return 0;
    }

}
