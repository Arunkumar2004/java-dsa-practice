package com.arun;

/* Q. Take integer inputs till the user enters 0 and print the largest number from
all. */

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int high = Integer.MIN_VALUE;

        while (true) {
            int n = in.nextInt();

            // if user press zero then break the loop.
            if ( n == 0) {
                break;
            }

            // Check whether new input is greater than last input. If yes now add this input variable i.
            if(n > high) {
                high = n ;
            }








        }
        System.out.print("the largest num is : " + high);
    }
}
