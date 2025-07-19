package com.arun;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int day = in.nextInt();


        switch (day) {
//                System.out.println("Monday");

            //                System.out.println("Tuesday");

            //                System.out.println("Wednesday");

            //                System.out.println("Thursday");

            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays");

//                System.out.println("Saturday");

            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("invalid day");
        }
    }

}
