package com.arun;

/* Take name as input and print a greeting message for that particular name. */

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Kindly Enter ur name: ");
        String name = in.next();
        System.out.println("How are u " + name);
    }
}
