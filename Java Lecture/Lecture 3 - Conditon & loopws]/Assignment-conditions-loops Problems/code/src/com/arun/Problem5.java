package com.arun;

// Q. Find HCF of a number.
public class Problem5 {
    public static void main(String[] args) {

        int a = 18;
        int b = 12;
        int div = 1;

        int ComF = 0;
        int HCF = 0;

        while (div <= a) {

            if (a % div == 0 && b % div == 0 ) {
                ComF = div;

                if (ComF > HCF) {

                    HCF = ComF;
                }
            }
            div = div + 1;

        }

        System.out.println("The HCF of given number is: " + HCF);

    }
}
