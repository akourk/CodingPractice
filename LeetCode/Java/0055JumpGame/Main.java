public class Main {
    public static void main(String[] args) {
        int[] nums0 = {2, 3, 1, 1, 4};
        System.out.println("true:" + Solution.canJump(nums0));
        int[] nums1 = {1, 2, 3};
        System.out.println("true:" + Solution.canJump(nums1));
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("false:" + Solution.canJump(nums2));
    }
}

class Solution {
    public static boolean canJump(int[] nums) {
        int maxJumps = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            maxJumps--;
            if (maxJumps < nums[i])
                maxJumps = nums[i];
            if (maxJumps == 0)
                return false;
        }

        return true;
    }
}