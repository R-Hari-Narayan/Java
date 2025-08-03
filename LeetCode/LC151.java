package LeetCode;

public class LC151 {


    public static String reverseWords(String s) {
        String[] split_s = s.trim().replaceAll(" +", " ").split(" ");

        StringBuffer reverse_s = new StringBuffer();

        reverse_s.append(split_s[split_s.length-1]);
        for (int i = split_s.length - 2; i >= 0; i--) {
            reverse_s.append(" ");
            reverse_s.append(split_s[i]);
        }
        return reverse_s.toString();
    }

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverseWords(s));
    }
}
