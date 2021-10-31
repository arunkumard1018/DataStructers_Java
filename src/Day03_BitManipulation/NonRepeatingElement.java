package Day03_BitManipulation;

public class NonRepeatingElement {
    /**
     * to find the one non repeating element in an array
     * input = [5,4,1,4,3,5,1] output = 3
     */
    public static int oneNonRepeatingNum(int[] arr) {
        int num = 0;
        for (int val : arr) {
            num ^= val;
        }return num;
    }
    /**
     * to find the two non repeating element in an array
     * input = [5,4,1,4,3,5,1] output = 3
     */

    public static void main(String[] args) {
        int[] arr = {5,4,1,4,3,5,1};
        System.out.println("oneNonRepeatingElement : " + oneNonRepeatingNum(arr));
    }
}
