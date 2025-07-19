package com.arun;

/* Write a program to print whether a number is even or odd, also take
input from the user. */

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num%2 == 0) {
            System.out.println("It's a Even number");
        } else {
            System.out.println("It's a Not- Even number");
        }





    }

}
