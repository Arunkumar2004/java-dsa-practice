package com.arun;

/* Take in two numbers and an operator (+, -, *, /) and calculate the value.
(Use if conditions) */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the num 1: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the operator + , - , * , / : ");
        String operator = input.next();

        System.out.print("Enter the num 2: ");
        double num2 = input.nextDouble();



        if (operator.equals("+") ) {
            double Ans = num1 + num2 ;
            System.out.println("The Answer for " + num1 + " " + operator + " " + num2 + " = " + Ans );


        }  else if (operator.equals("-")) {
            double Ans = num1 - num2;
            System.out.println("The Answer for " + num1 + " " + operator + " " + num2 + " = " + Ans );


        } else if (operator.equals("*")) {
            double Ans = num1 * num2;
            System.out.println("The Answer for " + num1 + " " + operator + " " + num2 + " = " + Ans );

        } else if (operator.equals("/")) {
            if (num2 != 0) {
                double Ans = num1 / num2;
                System.out.println("The Answer for " + num1 + " " + operator + " " + num2 + " = " + Ans );
            }


        }  else {
            System.out.println("Invalid operation ! ");

        }



    }
}
