package com.arun;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInFunction {
    public static void main(String[] args) {
        MatrixIn();

    }

    static void MatrixIn () {

        Scanner in = new Scanner(System.in);
        int[][] arr1 = new int[3][3];

        // Take the input:
            for (int row = 0; row < arr1.length; row++) {
            // each col in a row
            for (int col = 0; col < arr1[row].length; col++) {
                arr1[row][col] = in.nextInt();
            }
        }
        // Output of matrix:
            for (int row = 0; row < arr1.length; row++) {

                // 1 st method:
//                for (int col = 0; col < arr1[row].length; col++) {
//                    System.out.print(arr1[row][col] + " ");
//                }
//                System.out.println();

                // 2 nd method:
                System.out.println(Arrays.toString(arr1[row]));
            }
    }
}
