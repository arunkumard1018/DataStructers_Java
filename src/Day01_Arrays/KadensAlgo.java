package Day01_Arrays;
/**
 * Program to find maximum SubArray Sum Using Kaden's Algorithm approach
 * input = {10,-20,35,40,10,-10,-100,-50}
 * output = 85
 */
public class KadensAlgo {
    public static int MaxSubArraySum(int[] arr) {
        int MaxSum=arr[0],MaxSofor=arr[0],i;
        for (i = 1; i < arr.length; i++) {
            MaxSofor = Integer.max(arr[i],MaxSofor+arr[i]);
            MaxSum = Integer.max(MaxSum,MaxSofor);
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int[] arr = {10,-20,35,40,10,-10,-100,-50};
        System.out.println("KadensAlgo : "+ MaxSubArraySum(arr));
    }
}
