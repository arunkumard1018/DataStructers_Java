package Day03_BitManipulation;

/**
 *  to check weather the given String contains only unique characters
 *  Note the given String contain lowerCase Letters
 *  input = "arunakumara" output = false
 */
public class UniqueChars {
    public static boolean isuniquChars(String s) {
        long check = 0;
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i)-'a';
            if((check&(1<<ch)) > 0) return false;
            else check|=(1<<ch);
        }
        System.out.println(Long.toBinaryString(check));
        return true;
    }

    public static void main(String[] args) {
        String st = "aruna";
        System.out.println("is Given String contains unique Chars :"+ isuniquChars(st));
    }
}
