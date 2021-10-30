package Day01_Arrays;

/**
 * Program to find maximum SubArray Sum Using Brut force approach
 * input = {10,-20,35,40,10,-10,-100,-50}
 * output = 85
 */

public class MaxSubArraySum {
    // to print all possible Sub Arrays
    public static void displaySubArrays(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k]+" ");
                }System.out.println();
            }
        }
    }
    // maximum sub Array sum Using BrutForce Solution
    public static int maxSubArraySum(int[] arr) {
        int MaxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int currentsum = 0;
                for (int k = i; k <= j; k++) {
                    currentsum += arr[k];
                }MaxSum = Integer.max(MaxSum,currentsum);
            }
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int[] arr = {10,-20,35,40,10,-10,-100,-50};
//        displaySubArrays(arr);
        System.out.println("MaxSubArraySum : "+ maxSubArraySum(arr));
    }
}
