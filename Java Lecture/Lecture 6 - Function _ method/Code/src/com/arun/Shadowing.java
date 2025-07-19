package com.arun;

public class Shadowing {
    static int x = 100; // This will be shadowed at line 9
    public static void main(String[] args) {

        System.out.println(x); // 90
//        int x = 40 // the lower level will override the higher level at line 4. // here 40 will assign.

        int x; // Declaration
        x = 40; //initialised
        System.out.println(x); // We only print after the initialisation.
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}