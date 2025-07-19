package com.arun;

import java.util.Scanner;

public class StringExample {
    // Main Function
    public static void main(String[] args) {
        // call the method

//        String greet = msg();
//        System.out.println("How are u " + greet);

        Scanner in = new Scanner(System.in);
        String namee = in.next();
        String WishMsg = Greet(namee); // call function
        System.out.println(WishMsg);

    }

    // method
    static String Greet(String name) {
        String massage = "Hello " + name;
        return massage;
    }



    // Method
    static String msg() {
        Scanner in = new Scanner(System.in);
        String name = in.next();

//        String greeting = " how are u";

        return name;


    }
}
