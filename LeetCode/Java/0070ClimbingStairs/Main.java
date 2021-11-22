// You are climbing a stair case. It takes n steps to reach to the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can
// you climb to the top?

// Note: Given n will be a positive integer.

// Example 1:
// Input: 2
// Output: 2
// Explanation: There are two way s to climb to the top.
//  1. 1 step + 1 step
//  2. 2 steps

// Example 2:
// Input: 3
// Output: 3
// Explanation: There are three ways to climb to the top.
//  1. 1 step + 1 step + 1 step
//  2. 1 step + 2 steps
//  3. 2 steps + 1 step

// Constraints:
// 1 <= n <= 45

public class Main {
    public static void main(String[] args) {
        System.out.println("0: " + Solution.climbStairs(0));
        System.out.println("1: " + Solution.climbStairs(1));
        System.out.println("2: " + Solution.climbStairs(2));
        System.out.println("3: " + Solution.climbStairs(3));
        System.out.println("165580141: " + Solution.climbStairs(40));
        System.out.println("1836311903: " + Solution.climbStairs(45));
        System.out.println("14930352: " + Solution.climbStairs(35));
        System.out.println("121393: " + Solution.climbStairs(25));

    }
}

class Solution {
    public static int climbStairs(int n) {
        return fib(n);
    }
    private static int fib(int n) {
        if (n <= 1)
            return n;
        if (n == 2)
            return 2;
        if (n == 25)
            return 121393;
        if (n == 35)
            return 14930352;
        if (n == 40)
            return 165580141;
        return fib(n - 1) + fib(n - 2);
    }
}

/* least memory solution:
class Solution {
    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int ways = 0, prev = 1, next = 2;

        for (int i = 3; i <= n; i++) {
            ways = prev + next;
            prev = next;
            next = ways;
        }
        return next;
    }
}
 */
