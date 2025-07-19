package com.arun;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int num = input.nextInt();
//        float num = input.nextFloat();
//        System.out.println(num);

        // Type Casting
//        int num = (int) (56.787f);
//        System.out.println(num);

        // Automatic Type Promotion in expression
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;
//        System.out.println(d);

//        byte a = 50; // we cant store a integer in byte.
//        a = a * 2;

//        int number = 'E';
//        System.out.println(number);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 34.35f;
        double d = 23.798980800;
        double result = (f * b) + (i / c) - (d - s);
        // float + int - double = double  , Because   double > float > int
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);



    }
}
