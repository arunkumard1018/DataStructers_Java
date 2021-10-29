package Day01_Arrays;

import java.util.Random;
// randomly generate the unique name every time

public class Shuffler {

    public static void Shuffle(String[] arr) {
        Random rm = new Random();
        int end = arr.length;
        while(end>0){
            int random = rm.nextInt(end);
            System.out.println(arr[random]);
            String temp = arr[random];
            arr[random] = arr[end-1];
            arr[end-1] = temp;
            end--;
        }
    }
    public static void main(String[] args) {
        String[] arr = {"Arun","kiran","Chirag","Chandan","manoj","Sharath"};
        Shuffle(arr);
    }
}
