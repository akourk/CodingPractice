package LeetCode219ContainsDuplicateII;

//Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
//
//        Example 1:
//
//        Input: nums = [1,2,3,1], k = 3
//        Output: true
//        Example 2:
//
//        Input: nums = [1,0,1,1], k = 1
//        Output: true
//        Example 3:
//
//        Input: nums = [1,2,3,1,2,3], k = 2
//        Output: false

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 1};
        System.out.println("true:" + Solution.containsNearbyDuplicate(arr, 3));
    }
}

class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < i + k + 1 && j < nums.length; j++) {
                if (nums[j] == nums[i])
                    return true;
            }
        }

        return false;
    }
}