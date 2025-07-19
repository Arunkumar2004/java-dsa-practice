package com.arun;

// When we use while loop is we don,t know how many times the loop is going to run.
// When we use for loop is we know that how many times the loop is going to run.

public class WhileLoop {
    public static void main(String[] args) {

        /* Syntax for while loop

            while (condition) {
               // body
            }
        */

        // for ( initialisation ; condition ; increment/decrement )  - for reference

        int num = 1;
        while ( num <= 10) {
            System.out.println(num);
            num += 1;
        }

    }
}
