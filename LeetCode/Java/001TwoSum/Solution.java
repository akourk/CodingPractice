// Given an array of integers, return indices of the two
// numbers such that they add up to a specific target.
// You may assume that each input would have exactly one
// solution, and you may not use the same element twice.

public class Solution {

    public static int[] twoSum(int[] nums, int target) {


        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

/*

best result:

class Solution {
    public int[] twoSum(int[] nums, int target) {
    int max = 2048;
    int[] indexes = new int[max];
    int bitMode = --max;
    int first = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int difference = target - nums[i];
      if (difference == first) {
        return new int[]{0, i};
      }
      int index = indexes[difference&bitMode];
      if(index != 0) {
        return new int[]{index, i};
      }
      indexes[nums[i]&bitMode] = i;
    }
    return new int[0];
  }
}

 */