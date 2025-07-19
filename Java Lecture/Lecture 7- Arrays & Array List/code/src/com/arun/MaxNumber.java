package com.arun;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[] arr = {144 , 44, 7, 75, 77};
        System.out.print("Enter min index value: ");
        int min = in.nextInt();

        System.out.print("Enter max index value: ");
        int max = in.nextInt();

        int ans = MaxValue(arr, min, max);
        System.out.println("The max value between index " + min + " & " + max + " = " + ans);

    }

    static int MaxValue (int[] arr, int min, int max) {

        if (min > max){
            return -1;
        }
        if (arr == null){
            return -1;
        }
        int maxVal = arr[min]; // start from min value in entered input.
        for (int i = min; i <= max; i++) {
            if (arr[i] > maxVal ) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}
