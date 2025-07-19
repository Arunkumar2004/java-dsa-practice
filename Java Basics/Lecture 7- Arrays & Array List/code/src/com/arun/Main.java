package com.arun;

public class Main {
    public static void main(String[] args) {
        // Syntax for Arrays:
        // datatype [] Variable_name = new datatype [size];

        // Q. store 5 roll number:
//        int[] rollNo = new int[5];
//        // or Directly
//        int[] rollNo2 = {3, 5, 6, 7};

        int[] rollNo;  // Declaration of array. rollN is defined in stack memory.
        rollNo = new int[5]; // Initialisation : Actually, here object is being created in the Heap memory.
        System.out.println(rollNo[2]);

        // String - non primitive
        String[] arr = new String[4];
        System.out.println(arr[2]);






    }
}