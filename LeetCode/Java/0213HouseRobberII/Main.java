public class Main {
    public static void main(String[] args) {
        int[] nums0 = {2, 3, 2};
        int[] nums1 = {1, 2, 3, 1};
        System.out.println("3:" + Solution.rob(nums0));
        System.out.println("4:" + Solution.rob(nums1));

    }
}

class Solution {
    public static int rob(int[] nums) {
        int[] max = new int[nums.length + 1];
        
        max[0] = 0;
        max[1] = nums[0];

        for (int i = 2; i < max.length; i++)
            max[i] = Math.max(nums[i - 1] + max[i - 2], max[i - 1]);

        return Math.max(max[max.length - 1], max[max.length - 2]);
    }
}