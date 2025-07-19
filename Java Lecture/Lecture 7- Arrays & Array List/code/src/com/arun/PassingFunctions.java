package com.arun;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] num  = {1, 3, 3, 4, 5} ;
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
        // the Int are have mutable behaviour:

    }

    static void change (int[] arr) {
//        arr[1] = 2 ;
    }
}


//        for (int i = 0;  i < num.length; i++   ){
//            System.out.println(num[i]);
//            }
