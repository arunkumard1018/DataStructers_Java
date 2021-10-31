package Day03_BitManipulation;

/**
 *  program to count the ones present in binary form of given number
 *  input = 5 i.e : 1111
 *  output = 4
 */
public class CountOnes {
    public static int countOnes(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = (num&(num-1));
//            System.out.println(Integer.toBinaryString(num));
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 15; //output = 4
        System.out.println(Integer.toBinaryString(num));
        System.out.println("Total ones :"+countOnes(num));
    }
}
