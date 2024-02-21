package org.example;

import java.util.Arrays;

import static java.util.Collections.swap;

public class SwapIntegers {
//    public static void main(String[] args) {
//        int [] a = {1, 2, 4, 3 };
//        System.out.println(Arrays.toString(swap(a)));
//    }



    public static long[] Swap(int [] a, int b, int c){
         int temp = a[b];
         a[b] = a[c];
         a[c] = temp;

        return null;
    }
}
