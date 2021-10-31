package Day02_StringsProg;
/**
 *  Two strings are given write a program to check weather
 *  the one string is permutation of other
 *  input: s1="aruna" s2="runaa" output = true
 */
public class CheckforPermutation {
    /**
     * first approach Sort the given strings and check both are equal or not
     * i.e we know that if Two Strings are permutation of each other
     * they contain same characters but in different position and also both must be same length
     */
    public static String Sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    public static boolean ispermutations(String s1, String s2) {
        if(s1.length() == s2.length() && Sort(s1).equals(Sort(s2))) return true;
        return false;
    }

    /**
     * Second Approach using flag Arrays
     */
    public static boolean ispermutation(String s1, String s2) {
        if(s1.length() != s2.length()) return false;
        int[] flag = new int[128]; //Assuming that given Character set is ASCII
        for (int i = 0; i < s1.length(); i++) {
            int ch = s1.charAt(i);
            flag[ch]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            int ch = s2.charAt(i);
            flag[ch]--;
            if(flag[ch] < 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aruna",s2="runaa";
//        System.out.println("is both Strings are permutation of each :" + ispermutations(s1,s2));
        System.out.println("is both Strings are permutation of each :" + ispermutation(s1,s2));
    }
}
