package arun;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {23, 42, 13, 32, 3, 53};
        int target = 32;
        int start = 1;
        int end = 5;

        // Call the function
        int ans = search(arr, target, start, end);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int start, int end) {
        if (arr.length == 0){
           return -1;
        }

        for(int i = start; i <= end; i++ ) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
}
