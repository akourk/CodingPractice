/*
Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.

It is guaranteed that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.



Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


Constraints:

1 <= nums.length <= 2 * 104
-10 <= nums[i] <= 10
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};
        int[] nums3 = {-2, 3, -4};
        System.out.println("6: " + Solution.maxProduct(nums));
        System.out.println("0: " + Solution.maxProduct(nums2));
        System.out.println("24: " + Solution.maxProduct(nums3));
    }
}

class Solution {
    public static int maxProduct(int[] nums) {
        int output = nums[0];
        int currMin = 1;
        int currMax = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = currMin;
                currMin = currMax;
                currMax = temp;
            }
            currMax = Math.max(currMax * nums[i], nums[i]);
            currMin = Math.min(currMin * nums[i], nums[i]);
            output = Math.max(currMax, output);
        }
        return output;
    }
}

// O(n) ^, O(n^2) \/

/*
        int product;
        int max = Integer.MIN_VALUE;

        if (nums.length == 0)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            product = nums[i];
            if (product > max)
                max = product;
            for (int j = i + 1; j < nums.length; j++) {
                product *= nums[j];
                if (product > max)
                    max = product;
            }
        }
        return max;
    }
}
 */