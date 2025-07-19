package com.arun;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

//        // swap a number code:
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a , b);
        System.out.println(a + " " + b);
//____________________________________________________//
        String name = "Arun";
        ChangeName(name);
        System.out.println(name);
    }

    private static void ChangeName(String urname) {
        urname = "kumar";
    }
//________________________________________________________//

    // do this swap in function

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
