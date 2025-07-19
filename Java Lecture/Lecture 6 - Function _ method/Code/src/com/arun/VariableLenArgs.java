package com.arun;

import java.util.Arrays;

public class VariableLenArgs {
    public static void main(String[] args) {
//        fun(1, 2, 34, 56, 34,33, 23, 2,3,6);
//        multi(10, 20, "Arun" , "kumar", "AK"); // Multiple type of arguments in single array.

        demo (4, 4, 5, 7, 6 ,8 );
    }

    static void demo(int ...V) {
        System.out.println(Arrays.toString(V));
    }

    static void demo(String ...V) {
        System.out.println(Arrays.toString(V));
    }

    static void multi(int a , int b , String ...V) {
        System.out.println(Arrays.toString(V));
    }

    static void fun (int ...A) {  // ... is means the arrays. we use this when we don't know how many arguments to pass.
        System.out.println(Arrays.toString(A));
    }
}
