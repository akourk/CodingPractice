// Given an array of integers, return indices of the two
// numbers such that they add up to a specific target.
// You may assume that each input would have exactly one
// solution, and you may not use the same element twice.

public class Main {

    public static void main(String[] args) {


        int[] nums = new int[]{2, 7, 11, 15};
        Solution.twoSum(nums, 9);

        int[] pair = Solution.twoSum(nums, 9);

        for(int i = 0; i < pair.length; i++) {
            System.out.println(pair[i]);
        }


    }
}
