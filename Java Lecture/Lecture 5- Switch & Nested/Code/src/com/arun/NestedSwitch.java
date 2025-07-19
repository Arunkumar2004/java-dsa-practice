package com.arun;

import java.util.Scanner;

public class NestedSwitch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter ur EmpID: ");
        int EmpID = in.nextInt();


        switch (EmpID) {
            case 1 -> System.out.println("9842666957");
            case 2 -> System.out.println("7904577251");
            case 3 -> {
                System.out.print("Enter a dep: ");
                String Department = in.next();
                System.out.println("6384408220");

                switch (Department) {

                    case "IT":
                        System.out.println("Information Tech");
                        break;

                    case "CSE":
                        System.out.println("Computer science Engg");
                        break;

                    default:
                        System.out.println("Invalid");
                }
            }
            default -> System.out.println("enter a valid number");
        }
    }
}
