package com.arun;

// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class largeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is the largest number.");
        }
        else if (num1 < num2) {
            System.out.println(num2 + " is the largest number.");
        }
        else {
            System.out.println("Both numbers are equal");
        }

    }
}
