package com.arun;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String[] args) {

        // 2D Array:

        /* 1 2 3
           4 5 6
           7 8 9
                */
    //------------------------------------------//
        // take input print for a matrix:

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
        //normal

//        for (int row = 0; row < arr1.length; row++) {
//            for (int col = 0; col < arr1[row].length; col++) {
//                System.out.print(arr1 [row][col] + " ");
//            }
//            System.out.println();
//        }
        // using enhanced for loop:

        for(int[] a : arr1){
            System.out.println(Arrays.toString(a));
        }

     //----------------------------------------------//

         int [][] arr = {
                 {1, 2, 3},
                 {4,5 },
                 {6, 7, 8, 9}
         };

//        System.out.println(arr[1][1]);


        // rwo & col printing in defined value;
//        for (int row = 0; row < arr.length ; row++) {
//            for (int col = 0; col < arr[row].length ; col++) {
//                System.out.print(arr [row] [col] + " ");
//            }
//            System.out.println();
//        }


    //----------------------------------------------------------------------//


//  printing 1
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i][i] );
//        }

//  printing 2
//        System.out.println(Arrays.toString(arr[1]));


    }
}
