package LeetCode;

import java.util.List;
import java.util.ArrayList;
// Kids with the Greatest Number of Candies


class LC1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> output = new ArrayList<>();
        int max = 0;

        //Find the largest value of Candy
        for (int candy: candies) {
            if (candy > max) {
                max = candy;
            }
        }
        // System.out.println(max);
        
        for (int candy: candies) {
            output.add((candy + extraCandies >= max) ? true : false);
        }

        return output;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
