package com.arun;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int ans = sum2(20 , 20 ); // () is used to call a method.
        System.out.println(ans);
    }


    static int sum2(int a , int b) {
        int sum = a + b;
       return sum ;
    }


    // Return the value using return;

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 = ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 = ");
        int num2 = in.nextInt();

        int sum = num1 + num2 ;

        return sum; // This will return a value and end the program after this return.

//        System.out.println("This line never will execute");
    }


}
