package com.arun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sum();
        sum();

    }


    // Q. Take input and sum the number:

    static void sum () {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = in.nextInt();

        int sum = num1 + num2 ;
        System.out.println("The sum = " + sum);
    }


    /* return_type name() {
        // body
        return statement;
    }
     */


    public static class Greeting {
        public static void main(String[] args) {
            Greeting();
        }

        static void Greeting() {    // this is a method.
            System.out.println("Hello world");
        }
    }
}