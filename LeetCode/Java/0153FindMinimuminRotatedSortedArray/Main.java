/*
Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.



Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.
Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.


Constraints:

n == nums.length
1 <= n <= 5000
-5000 <= nums[i] <= 5000
All the integers of nums are unique.
nums is sorted and rotated between 1 and n times.
 */

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {0, 1, 2, 4, 5, 6, 7};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {3, 4, 5, 1, 2};
        int[] nums4 = {1, 0};
        int[] nums5 = {0, 1};
        int[] nums6 = {5, 1, 2, 3, 4};
        System.out.println(Solution.findMin(nums1));
        System.out.println(Solution.findMin(nums2));
        System.out.println(Solution.findMin(nums3));
        System.out.println(Solution.findMin(nums4));
        System.out.println(Solution.findMin(nums5));
        System.out.println(Solution.findMin(nums6));
    }
}

class Solution {
    public static int findMin(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int left = 0;
        int right = nums.length - 1;
        int mid = (right + left) / 2;
        int min = Math.min(nums[left], nums[right]);

        while (right - left > 1) {
            if (Math.abs(nums[left] - nums[mid]) > Math.abs(nums[right] - nums[mid])) {
                right = mid;
            } else if (Math.abs(nums[left] - nums[mid]) < Math.abs(nums[right] - nums[mid])) {
                left = mid;
            } else {
                left += 1;
            }

            mid = (right + left) / 2;
            min = Math.min(min, Math.min(nums[left], nums[right]));
        }
        return min;
    }
}
