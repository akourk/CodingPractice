public class Solution {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int tempmax;
        for (int i = 0; i < nums.length; i++) {
            tempmax = nums[i];
            if (tempmax > max)
                max = tempmax;
            for (int j = i + 1; j < nums.length; j++) {
                tempmax += nums[j];
                if (tempmax > max)
                    max = tempmax;
            }
        }
        return max;
    }
}
