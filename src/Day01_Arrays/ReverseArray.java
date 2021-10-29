package Day01_Arrays;
import com.DSA.Myfunctions;

public class ReverseArray {
    public static int[] reverse(int[] arr) {
        for(int i=0;i<arr.length/2;i++){
            Myfunctions.Swap(arr, i, arr.length - 1 - i);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Array Before reverse");
        Myfunctions.display(arr);
        System.out.println("Array After reverse");
        Myfunctions.display(reverse(arr));
    }
}
