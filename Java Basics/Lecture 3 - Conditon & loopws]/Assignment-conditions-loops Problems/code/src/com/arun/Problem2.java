package com.arun;

// Q. Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int div = 1;
        int ans = 0;

        while ( div <= n) {

            if (n % div == 0) {
                System.out.println(div);

            }
            div += 1;



        }

    }
}
