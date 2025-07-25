package LeetCode;

class LC1769 {
    // Merge strings alternatively

    public static String mergeAlternately(String word1, String word2) {
        StringBuffer output = new StringBuffer();
        int i = 0;
        while (i < word1.length()) {
            output.append(word1.charAt(i));
            if (i < word2.length()) {
                output.append(word2.charAt(i));
            }
            i++;
        }
        while (i < word2.length()) {
            output.append(word2.charAt(i));
            i++;
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }
}