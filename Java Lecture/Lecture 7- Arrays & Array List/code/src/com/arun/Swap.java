package com.arun;

import java.util.Arrays;

// Q. Swap the index value in Array:
public class Swap {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 2, 5, 6};
        System.out.println(Arrays.toString(arr));

//        swap(arr, 1, 3 );
        ReverseNum(arr);

        // 1. print: enhanced
        System.out.println(Arrays.toString(arr));

        // 2. print: normal
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

    }

    static void ReverseNum (int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            //swap:
            swap(arr, start, end);
            start++;
            end--;

        }
    }



    // create the function
    static void swap (int [] arr, int index1, int index2) {
        int Temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = Temp;
    }
}
