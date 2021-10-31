package Day03_BitManipulation;
/**
 * Basic operations on Bit Manipulation
 * 1) getBit --> to get the bit status of given position
 * 2) setBit --> to set the bit to '1' at given position
 * 3) clearBit --> to set the bit to '0' at given position
 * 4) updateBit --> to update bit to 0 or 1 at given
 * 5) check the given number is odd or even
 */
public class BasicOperations {
    public static int getBit(int num, int pos) {
         int BitMask = 1<<pos-1;
         if((num & BitMask) == 0) return 0;
         else return 1;
    }

    public static int setBit(int num, int pos) {
        int bitMask = 1<<pos-1;
        return (bitMask | num);
    }

    public static int clearBit(int num, int pos) {
        int bitMask = ~(1<<pos-1);
        return (num & bitMask);
    }

    public static int updateBit(int num, int pos, int to) {
        int bitMask = 1<<pos-1;
        if (to == 0) {
            return (num & (~bitMask));
        }else return (bitMask | num);
    }

    public static boolean iseven(int num) {
        if((num & 1) ==0) return true;
        return false;
    }



    public static void main(String[] args) {
        int num = 5; // 0101
//        System.out.println(getBit(5,3));  // output = 1
//        System.out.println(setBit(num,2)); //output = 7
//        System.out.println(clearBit(num,3)); //output =1
//        System.out.println(updateBit(num,2,1)); // output = 7
//        System.out.println(updateBit(num,3,0)); // output = 1
        System.out.println(iseven(5)); // output = false
    }
}
