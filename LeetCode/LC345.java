package LeetCode;

import java.util.Set;

public class LC345 {

    public static String reverseVowels(String s) {
        int l = 0;
        int r = s.length()-1;
        Set<Character> vowels = Set.of('a','e','i','o','u','A','E','I','O','U');
        StringBuffer sBuffer = new StringBuffer(s);
        
        while(l<r) {
            //Navigate left pointer to next Vowel
            while (l<r && !vowels.contains(s.charAt(l))) {
                l++;
            }
            //Navigate right pointer to next Vowel
            while (r>l && !vowels.contains(s.charAt(r))) {
                r--;
            }
            //Swap vowels in left with right
            sBuffer.setCharAt(l, s.charAt(r));
            sBuffer.setCharAt(r, s.charAt(l));
            l++;
            r--;
        }
        
        return sBuffer.toString();
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
    }
}
