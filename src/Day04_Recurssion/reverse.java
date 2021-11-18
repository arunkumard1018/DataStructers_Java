package Day04_Recurssion;

import java.util.Scanner;

public class reverse {
//
//    public static void StackOverFlow(String st,int n){
//        System.out.println(st + " Filling the System Stack "+n);
//        StackOverFlow(st,n+1);
//    }

    public static void reverseString(String s,int len){
        if(len == 0) return;
        System.out.print(s.charAt(len-1));
        reverseString(s,len-1);
    }

    public static void main(String[] args) {
        String st = new Scanner(System.in).nextLine();
//        reverseString(st,st.length());
//        StackOverFlow("Arun",1);
    }
}
