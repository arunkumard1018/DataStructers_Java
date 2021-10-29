package com.DSA;

public class Myfunctions {

    // To Swap an Integer Array Elemnts
    public static void Swap(int[] arr,int index1,int index2){
        if(index1 >= arr.length || index2 >= arr.length || index2<0 || index1<0) return;
        arr[index1] = arr[index1]^arr[index2];
        arr[index2] = arr[index1]^arr[index2];
        arr[index1] = arr[index1]^arr[index2];
    }

    // To display Array
    public static void display(int[] arr){
        for (int value : arr) {
            System.out.print(value+" ");
        }System.out.println();
    }

    // to Reverse An Array
    public static int[] reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            Swap(arr, i, arr.length - 1 - i);
        }
        return arr;
    }
}

