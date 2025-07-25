package LeetCode;
import java.lang.Math;

class LC1071 {
    public static int gcd(int num1, int num2) {
        int rem = num1>num2? num1%num2: num2%num1;
        if (rem == 0) {
            return Math.min(num1, num2);
        }
        return gcd(Math.min(num1, num2), rem);
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int endIndex= gcd(str1.length(), str2.length());
        return str1.substring(0, endIndex);
    }

    public static void main(String[] args) {
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(gcdOfStrings(str1, str2));
    }
}