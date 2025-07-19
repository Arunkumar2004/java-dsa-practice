package com.arun;

public class OverLoading {

    // The overloading means when a two or more function name is same
    public static void main(String[] args) {

        fun(25); // During the compile time it choose to be run.
    }

    static void fun (int a){
        System.out.println(a);
    }

    static void fun( String name) {
        System.out.println(name);
    }
}
