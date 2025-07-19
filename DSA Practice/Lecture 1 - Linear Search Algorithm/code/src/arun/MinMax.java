package arun;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {4, 7, 3, 9999999, 9, 0};
        int n = arr.length;
        System.out.println("The minimum value in the Array : " + Mini(arr, n));
        System.out.println("The maximum value in the Array : " + Maxi(arr, n));
    }
    // For minimum value
    static int Mini (int[] arr, int n ) {
        // initialize the mini value:
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < mini) {
                mini = arr[i];
            }
        }
        return mini;
    }

    // For Maximum value :
    static int Maxi (int[] arr, int n) {
        // Initialize the Maxi value:
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > maxi) {
                maxi = arr[i];
            }

        }
        return maxi;
    }
}
