package Day04_Recurssion;

public class BasicProb {
    static int count=0;
    public static int SumofNaturalNum(int n) {
        if(n==0) return 0;
        return SumofNaturalNum(n-1)+n;
    }

    public static void TOH(int n, int a, int b, int c) {
        if (n > 0) {
            TOH(n-1,a,c,b);
            System.out.println(a+" "+c+"count :"+ ++count);
            TOH(n-1,b,a,c);
        }
    }




    public static void main(String[] args) {
//        System.out.println("Sum of N natural no "+SumofNaturalNum(4));
//        TOH(4,1,2,3);
    }
}
