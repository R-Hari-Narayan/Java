package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LC605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        List<Integer> newFlowerBed = new ArrayList<>();

        //Adding 0 in front and end of array
        newFlowerBed.add(0);
        for (int plot : flowerbed) {
            newFlowerBed.add(plot);
        }
        newFlowerBed.add(0);


        for (int i = 1; i <= flowerbed.length; i++) {
            if (newFlowerBed.get(i) == 0 && newFlowerBed.get(i-1) == 0 && newFlowerBed.get(i+1) == 0) {
                newFlowerBed.set(i, 1);
                n--;
            }
        }
        System.out.println(newFlowerBed);
        return (n <= 0);
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1,0,0};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
