import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] nums1 = {-1, 2, 1, -4};
        int[] nums2 = {0, 0, 0};
        System.out.println("2:" + Solution.threeSumClosest(nums1, 1));
        System.out.println("0:" + Solution.threeSumClosest(nums2, 1));

    }
}

class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k) {
                if (Math.abs(nums[i] + nums[j] + nums[k] - target) < Math.abs(closest - target))
                    closest = nums[i] + nums[j] + nums[k];
                if (closest == target)
                    return closest;
                if (nums[i] + nums[j] + nums[k] < target)
                    j++;
                if (nums[i] + nums[j] + nums[k] > target)
                    k--;
            }
        }

        return closest;
    }
}