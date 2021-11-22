package LeetCode172FactorialTrailingZeroes;

// Given an integer n, return the number of trialing zeroes in n!.

// Follow up: Could you write a solution that works in logarithmic time complexity?

// Ex:
// Input:   n = 3
// Output:  0
// Explanation: 3! = 6, no trialing zero.

// Ex:
// Input:   n = 5
// Output:  1
// Explanation: 5! = 120, one trailing zero.

// Ex:
// Input:   n = 0
// Output:  0

public class Main {
    public static void main(String[] args) {
        System.out.println("0:" + Solution.trailingZeroes(0));
        System.out.println("0:" + Solution.trailingZeroes(3));
        System.out.println("1:" + Solution.trailingZeroes(5));
        System.out.println("2:" + Solution.trailingZeroes(13));
        System.out.println("7:" + Solution.trailingZeroes(30));
        System.out.println("49:" + Solution.trailingZeroes(200));
    }
}

class Solution {
    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            count += (n/5); 
            n /= 5;
        }
        return count;
    }
}
//class Solution {
//    public static int trailingZeroes(int n) {
//        int count = 0;
//        int iter = 1;
//        while (Math.pow(5, iter) <= n) {
//            count += (n / Math.pow(5, iter));
//            iter++;
//        }
//        return count;
//    }
//}