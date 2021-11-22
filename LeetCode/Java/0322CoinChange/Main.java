import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 5};
        System.out.println(Solution.coinChange(arr0, 11));
        int[] arr1 = {2};
        System.out.println(Solution.coinChange(arr1, 3));
        int[] arr2 = {1};
        System.out.println(Solution.coinChange(arr2, 0));
        int[] arr3 = {1};
        System.out.println(Solution.coinChange(arr3, 1));
        int[] arr4 = {1};
        System.out.println(Solution.coinChange(arr4, 2));
        int[] arr5 = {2, 5, 10, 1};
        System.out.println(Solution.coinChange(arr5, 27));
        int[] arr6 = {186, 419, 83, 408};
        System.out.println(Solution.coinChange(arr6, 6249));


    }
}

class Solution {
    public static int coinChange(int[] coins, int amount) {
        int[] mins = new int[amount + 1];
        for (int i = 1; i <= amount; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && mins[i - coins[j]] != Integer.MAX_VALUE) {
                    min = Math.min(min, mins[i - coins[j]] + 1);
                }
            }
            mins[i] = min;
        }
        if (mins[amount] == Integer.MAX_VALUE)
            return -1;
        return mins[amount];
    }
}

// this doesn't work.
//class Solution {
//    public static int coinChange(int[] coins, int amount) {
//        int num = 0;
//        Arrays.sort(coins);
//        for (int i = coins.length - 1; i >= 0; i--) {
//            while (amount >= coins[i]) {
//                amount -= coins[i];
//                num++;
//            }
//        }
//        if (amount == 0) {
//            return num;
//        }
//        return -1;
//    }
//}