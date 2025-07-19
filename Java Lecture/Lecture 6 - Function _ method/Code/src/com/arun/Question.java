package com.arun;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean prime = IsPrime(n);
        System.out.println(prime);
    }

    static boolean IsPrime (int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if ( n % c == 0) {
                return false;
            }
            c = c + 1;

        }

        return c * c > n;
//        if (c * c > n) {
//            return true;
//        }
//        return false;

    }
}
