package Day02_StringsProg;

/**
 *  to check the given String contains only unique Characters
 *  input = "arunakumar" output = false
 */

public class UniqeChars {

    public static boolean isunique(String s) {
        boolean[] charset = new boolean[122]; // Assuming that given charset is ASCII
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if(charset[ch]) return false;
            else charset[ch] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Arun";
        System.out.println("UniqeChars :"+ isunique(s));

    }
}
