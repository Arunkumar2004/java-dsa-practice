package com.arun;

// Switch cases //

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        //_____________________________________________________//

        /* Syntax of switch case :

            switch (Expression) {

                // cases
                case one:
                    // do something;
                    break;

                case two:
                    // do something;
                    break;

                default:
                    // do something;
            }  */

            //______________________________________________//

        // Q. Take a fruit input and comment the fruit.

//        switch (fruit) {
//
//            case "Apple" :
//                System.out.println("The red fruit");
//                break;
//
//            case "Jack" :
//                System.out.println("A sweet fruit");
//                break;
//
//            case "Orange" :
//                System.out.println("A a round fruit");
//                break;
//
//            default:
//                System.out.println("A invalid fruit");
//        }

        // The enhanced syntax for switch []


        switch (fruit) {
            case "Apple" -> System.out.println("The red fruit");
            case "Jack" -> System.out.println("A sweet fruit");
            case "Orange" -> System.out.println("A a round fruit");
            default -> System.out.println("A invalid fruit");
        }












    }
}