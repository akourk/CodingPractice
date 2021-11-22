public class Main {
    public static void main(String[] args) {
        int[] nums0 = {2, 3, 1, 1, 4};
        System.out.println("true:" + Solution.canJump(nums0));
    }
}


class Solution {
    public static boolean canJump(int[] nums) {
        int[] jumps = new int[nums.length];

        if (nums.length < 2)
            return true;
        if (nums[0] == 0)
            return false;

        int maxJumpLength = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            maxJumpLength--;
            if (maxJumpLength < nums[i]) {
                maxJumpLength = nums[i];
            }
            if (maxJumpLength == 0)
                return false;
        }



        return true;
    }
}


