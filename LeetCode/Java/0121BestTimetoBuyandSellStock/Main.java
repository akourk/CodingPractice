package LeetCode121BestTimetoBuyandSellStock;

// Say you have an array for which the ith element is the price of a given stock on day i.

// If you were only permitted to complete at most one transaction (i.e., buy one and sell one share
// of the stock), design an algorithm to find the maximum profit.

// Note that you cannot sell a stock before you buy one.

// Ex.
// Input:   [7, 1, 5, 3, 6, 4]
// Output:  5
// Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
//              Not 7 - 1 = 6, as selling price needs to be larger than buying price.

// Ex.
// Input:   [7, 6, 4, 3, 1]
// Output:  0
// Explanation: In this case, no transaction is done, i.e. max profit = 0.

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {7, 1, 5, 3, 6, 4};
        System.out.println("5:" + Solution.maxProfit(arr1));
    }
}

class Solution {
    public static int maxProfit(int[] prices) {
        int max = 0;

        int start;

        for (int i = 0; i < prices.length; i++) {
            start = prices[i];
            for (int j = i; j < prices.length; j++) {
                if (prices[j] - start > max)
                    max = prices[j] - start;
            }
        }
        return max;
    }
}

// fastest solution: O(n)

//class Solution {
//    public static int maxProfit(int[] prices) {
//        int hold = Integer.MIN_VALUE;
//        int sell = 0;
//        int oldHold;
//        for (int p : prices) {
//            oldHold = hold;
//            hold = Math.max(hold, -p);
//            sell = Math.max(sell, oldHold + p);
//        }
//        return sell;
//    }
//}