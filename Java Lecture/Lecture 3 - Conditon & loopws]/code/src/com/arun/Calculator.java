package com.arun;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        // Take input till user press ' x ' or ' X ' :

        Scanner in = new Scanner(System.in);
        int ans = 0;

        while(true) {

            System.out.println("Press X or x to break the program"); // msg to stop

            // Take the operator as input
            System.out.print("Operator : + , - , * , / , % :  ");
            char op = in.next().trim().charAt(0);



            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                // Take number as input
                System.out.print("Enter a num 1: ");
                int num1 = in.nextInt();

                System.out.print("Enter a num 2: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                    System.out.println(ans);
                }

                if (op == '-') {
                    ans = num1 - num2;
                    System.out.println(ans);
                }

                if (op == '*') {
                    ans = num1 * num2;
                    System.out.println(ans);
                }

                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                        System.out.println(ans);
                    }
                    else {
                        System.out.println("Can't Divide by zero");
                    }
                }

                if (op == '%') {
                    ans = num1 % num2;
                    System.out.println(ans);
                }

            }
            else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("Invalid Operation");
            }




        }
    }
}
