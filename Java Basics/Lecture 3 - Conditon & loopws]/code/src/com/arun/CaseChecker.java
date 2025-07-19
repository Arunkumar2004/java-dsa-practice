package com.arun;

// Q. the char is upper or lower case.

import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("given character is lower case ");

        }
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        }
        else {
            System.out.println("invalid char");
        }



        System.out.println(ch);
    }
}
