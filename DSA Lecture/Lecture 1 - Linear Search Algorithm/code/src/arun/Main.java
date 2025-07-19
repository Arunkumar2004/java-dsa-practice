package arun;

public class Main {
    public static void main(String[] args) {
        int[] arr = {23, 42, 13, 32, 3, 53};
        int target = 2;

        // now call the method:
        int ans = linearSearch2 (arr, target);
        System.out.println(ans);

    }

    // Q. Search in array : To return the index if it is target , otherwise return -1 :

    static int linearSearch (int [] arr , int target) {
        if(arr.length == 0) {
            return -1;
        }
         
        // run the for loop to itirate the values if it is target or not:
        for (int index = 0; index < arr.length; index++ ) {
            // check for every element in index is equal to target:
            int element = arr[index];
            if(element == target) {
                return index;
            }
        }
        return -1;   
    }

     // Q. Search in array : To return the element if it is target , otherwise return -1 :

    static int linearSearch2 (int [] arr , int target) {
        if(arr.length == 0) {
            return Integer.MAX_VALUE;
        }
         
        // run the for loop to itirate the values if it is target or not:
        for (int element : arr ) {  // This is Enhanced for loop
            if(element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;   
    }


    // Q. Search in array : To return the boolean if it is target , otherwise return -1 :

    static boolean  linearSearch3 (int [] arr , int target) {
        if(arr.length == 0) {
            return false;
        }
         
        // run the for loop to itirate the values if it is target or not:
        for (int element : arr ) {  // This is Enhanced for loop
            if(element == target) {
                return true;
            }
        }
        return false;   
    }
}