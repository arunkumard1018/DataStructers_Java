package Day01_Arrays;

import java.util.HashMap;

/**
 * program to find the indexs of the given target sum
 * input = [2,7,11,15] target = 9
 * output = [0,1]    i.e 2+7=9
 */
public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = target - arr[i];
            if (hm.containsKey(num)) return new int[]{hm.get(num),i};
            else hm.put(arr[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        com.DSA.Myfunctions.display(twoSum(arr,9));
    }
}
