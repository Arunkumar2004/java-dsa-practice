package com.arun;

// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        while (true) {
            int num = in.nextInt();


            if (num == 0) {
                break;
            }
            sum = sum + num;


        }
        System.out.println(sum);
    }
}
