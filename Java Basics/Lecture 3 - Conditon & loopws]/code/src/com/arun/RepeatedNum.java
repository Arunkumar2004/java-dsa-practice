package com.arun;

import java.util.Scanner;

public class RepeatedNum {
    public static void main(String[] args) {

        // This problem is to count the reputation of number.

        int n = 1343533544;

        int count = 0;
        Scanner in = new Scanner(System.in);
        int i = 6;

        while (n > 0){

            int rem = n % 10;
            if (rem == 6) {
                count +=1;
            }
            n = n/10;       //     n /= 10

        }
        System.out.println(count);

    }
}
