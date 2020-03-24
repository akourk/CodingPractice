// Given an integer array nums, find the contiguous subarray (containing at
// least one number) which has the largest sum and return its sum.

// Example:
// Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4],
// Output: 6
// Explanation: [4, -1, 2, 1] has the largest usm = 6.

// Follow up:
// If you have figured out the O(n) solution, try coding another solution using
// the divide and conquer approach, which is more subtle.

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("6: " + Solution.maxSubArray(arr1));
    }
}
