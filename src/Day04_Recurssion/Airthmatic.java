package Day04_Recurssion;

import java.util.Scanner;

public class Airthmatic {
    public static void fibSeries(int n){
        int count1 = 0;
        int count2 = 1;
        System.out.print(count1);
        System.out.print(count2);
        int sum;
       for(int i=2;i<n;i++){
           sum = count1+count2;
           System.out.print(sum);
           count1=count2;
           count2=sum;
       }
    }
    public static void fibSeriesRec(int num1,int num2,int n){
        if( n==0 ) return;
        int sum = num1+num2;
        System.out.print(sum);
        fibSeriesRec(num2,sum,n-1);
    }
    public static int power(int x, int y) {
        if( y==0 ) return 1;
        if( y==1 ) return x;
        return power(x,y-1)*x;
    }
    /**
     * optimized solution
     * @return x to the power y
     */
    public static int powerof(int x,int y){
        if( y==0 ) return 1;
        if( y==1 ) return x;

        if (y % 2 != 0) {
            return powerof(x,y/2)*powerof(x,y/2)*x;
        }
        else{
            return powerof(x,y/2) * powerof(x,y/2);
        }
    }
    public static int factorial(int n) {
        if(n==1 || n==0) return 1;

        return factorial(n-1) * n;
    }
    public static int sumofNnaturalNumbers(int n){
        if(n==0){
            return 0;
        }
        return sumofNnaturalNumbers(n-1)+n;
    }


    public static void main(String[] args) {

//        System.out.println(sumofNnaturalNumbers(3));
//        System.out.println(factorial(5));
//        System.out.println(power(2,5));
//        System.out.println(powerof(2,5));
//        fibSeries(6);
        /**
         * to Print fib Series using recursion
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(0);
        System.out.print(1);
        fibSeriesRec(0,1,n-2);
    }

}
