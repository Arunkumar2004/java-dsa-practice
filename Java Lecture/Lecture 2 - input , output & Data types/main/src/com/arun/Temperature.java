package com.arun;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the Temperature in C : ");
        float TempC = input.nextFloat();

        float TempF = (TempC * 9/5) + 32;

        System.out.println(TempC + " to F is = " + TempF);
    }
}
