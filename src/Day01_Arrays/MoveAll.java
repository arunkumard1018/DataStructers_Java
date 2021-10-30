package Day01_Arrays;
import com.DSA.Myfunctions;


public class MoveAll {

    public static int[] moveZerosAtEnd(int[] arr){
        int ZeroPionter = -1 ,NonZeroPointer;
        for (NonZeroPointer=0;NonZeroPointer<arr.length;NonZeroPointer++){
            if(arr[NonZeroPointer]>0) Myfunctions.Swap(arr,++ZeroPionter,NonZeroPointer);
        }
        return arr;
    }

    public static int[] movePositiveAtEnd(int[] arr){
        int PositivePointer = -1,NegitivePointer,temp;
        for (NegitivePointer=0;NegitivePointer<arr.length;NegitivePointer++){
            if(arr[NegitivePointer]<0){
                temp = arr[NegitivePointer];
                arr[NegitivePointer] = arr[++PositivePointer];
                arr[PositivePointer] = temp;
            }
        }
        return arr;
    }
    public static int[] moveNegitiveAtEnd(int[] arr){
        int PositivePointer,NegitivePointer = -1,temp;
        for (PositivePointer = 0; PositivePointer < arr.length; PositivePointer++) {
            if (arr[PositivePointer] >= 0) {
                temp = arr[PositivePointer];
                arr[PositivePointer] = arr[++NegitivePointer];
                arr[NegitivePointer] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,0,0,2,0,4,0,3,3,4,0};
        int[] newarr = {-4,9,-3,0,8,23,6,-1,-5};
        Myfunctions.display(moveZerosAtEnd(newarr));
        Myfunctions.display(movePositiveAtEnd(newarr));
        Myfunctions.display(moveNegitiveAtEnd(newarr));
    }
}
