package com.arun;

import java.util.Scanner;

// Q. print all 3 digit Armstrong numbers:
public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = IsArmstrong(n);
//        System.out.println(ans);
        // Print Armstrong numbers using for loop:
        for (int i = 100; i < 1000; i++) {
            if (IsArmstrong(i)) { // call the method and pass i ( which is from 100 to 999) parameter:
                System.out.println(i + " ");
            }
        }

    }
    static boolean IsArmstrong(int n) {
        int sum = 0;
        int original = n;
        while (n > 0) {

            int rem = n % 10;
            int cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10 ;

        }
        return original == sum;
//        if (original == sum ){
//            return true;
//        }
//        return false;
    }

}
