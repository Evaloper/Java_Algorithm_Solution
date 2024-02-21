package org.example;

import org.w3c.dom.ls.LSOutput;

public class solveWithdraw {
    public static void main(String[] args) {
        System.out.println(solve(1250));
        System.out.println(solve(1500));
    }

    public static int solve(int n){
        int[] bills = {500, 200, 100, 50, 20, 10};
        int count = 0;

        for( int bill : bills) {
            int numBills = n / bill;
            n = n % bill;
            count = count + numBills;
        }

             if ( n > 0){
                 return -1;
             }

        return count;

    }
}
