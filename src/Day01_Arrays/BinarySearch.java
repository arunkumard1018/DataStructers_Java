package Day01_Arrays;

import com.DSA.Myfunctions;

public class BinarySearch {
    public static int BinarySearchItr(int arr[], int key) {
        int low = 0;
        int high = arr.length,mid;
        while (low <= high) {
            mid = (low+high)/2;
            if(key == arr[mid]) return mid;
            if (key > arr[mid]) {
                low = mid+1;
            }else high = mid-1;
        }
        return -1;
    }

    public static int BinarySearchRec(int arr[], int low, int high,int key) {
        int mid = (low+high)/2;
        if(key == arr[mid]) return mid;
        if (low < mid) {
            if (key > arr[mid]) {
                return BinarySearchRec(arr,mid+1,high,key);
            } else return BinarySearchRec(arr,low,mid-1,key);
        }else return -1;

    }

    public static void main(String[] args) {
       int arr[] = Myfunctions.oddLengthSortedArray;
       Myfunctions.display(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("The element "+arr[i]+" Prestent AT :"+BinarySearchItr(arr,arr[i]));

        }
        System.out.println("The element "+8+" Prestent AT :"+BinarySearchRec(arr,0,arr.length,19));
    }
}
