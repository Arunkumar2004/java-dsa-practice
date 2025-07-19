package com.arun;

// Q. Subtract the Product and Sum of Digits of an Integer:

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int n = in.nextInt();

        int ori = n;
        int sum = 0;
        int pro = 1;
//        int ans = 0;

        while (n > 0) {

            int rem = n % 10; // get a last digit

            sum = sum + rem; // sum += rem;
            pro = pro * rem;

            n = n / 10;

        }
        int ans = pro - sum;
        System.out.println("Product - sum of digit of " + ori + " = " + ans);



    }

}
