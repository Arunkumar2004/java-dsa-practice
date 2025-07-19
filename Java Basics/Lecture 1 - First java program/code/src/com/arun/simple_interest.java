package com.arun;

/* Write a program to input principal, time, and rate (P, T, R) from the user and
find Simple Interest. */

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Principle amount: ");
        int prin = input.nextInt();

        System.out.print("Enter the time Period in year: ");
        int year = input.nextInt();

        System.out.print("Enter a Interest amount: ");
        int rate = input.nextInt();

        double SimpleInterest = (prin* year* rate)/100.0;

        boolean Simple_interest;
        System.out.println(SimpleInterest);


    }
}
