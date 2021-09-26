/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1


Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104
 */

public class Main {
    public static void main(String[] args) {

        int[] nums1 = {0, 1, 2, 4, 5, 6, 7};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {3, 4, 5, 1, 2};
        int[] nums4 = {1, 0};
        int[] nums5 = {0, 1};
        int[] nums6 = {5, 1, 2, 3, 4};
        int[] nums7 = {7, 0, 1, 2, 3, 4, 5};
        int[] nums8 = {1, 3};
        int[] nums9 = {1, 3, 5};
        System.out.println("0:" + Solution.search(nums1, 0));
        System.out.println("4:" + Solution.search(nums2, 0));
        System.out.println("-1:" + Solution.search(nums3, 0));
        System.out.println("1:" + Solution.search(nums4, 0));
        System.out.println("0:" + Solution.search(nums5, 0));
        System.out.println("-1:" + Solution.search(nums6, 0));
        System.out.println("1:" + Solution.search(nums7, 0));
        System.out.println("0:" + Solution.search(nums8, 1));
        System.out.println("2:" + Solution.search(nums2, 6));
        System.out.println("-1:" + Solution.search(nums9, 2));
    }
}

class Solution {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[left] <= nums[mid])
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            else
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;

        }
        return -1;
    }
}

/*
if (target > nums[left] && target < nums[mid]) {
                right = mid;
            } else if (target > nums[mid] && target < nums[right]) {
                left = mid;
            } else if (target > nums[left] && target > nums[mid]){
                right = mid;
            } else if (target > nums[mid] && target > nums[right]){
                left = mid;
            } else {
                left++;
            }
 */