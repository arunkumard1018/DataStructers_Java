package Day01_Arrays;

/*
        to find smallest Missing number in Array using BitWise operators
        array n number ranges from 1 to 50
 */

public class SmallestMissingNo {
    public static int MissingNumber(int[] arr){
        long check = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]>0) {
                check = check|(1<<arr[i]);
            }
        }
        for (int i=1;i<64;i++) {
            if ((check & (1 << i)) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,5,-4};
        System.out.println(MissingNumber(arr));

    }
}
