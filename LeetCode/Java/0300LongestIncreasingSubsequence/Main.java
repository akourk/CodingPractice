import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] nums0 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums1 = {0, 1, 0 , 3, 2, 3};
        System.out.println("4:" + Solution.lengthOfLIS(nums0));
        System.out.println("4:" + Solution.lengthOfLIS(nums1));
    }
}

// second attempt (working forwards, easier to understand):
// O(n^2)
class Solution {
    public static int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        int max = 0;

        for (int i = 0; i < LIS.length; i++) {
            LIS[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j])
                    LIS[i] = Math.max(LIS[i], LIS[j] + 1);
            }
            if (LIS[i] > max)
                max = LIS[i];
        }

        return max;
    }
}

// O(n^2)
// first attempt (working backwards):
// class Solution {
//     public static int lengthOfLIS(int[] nums) {
//         int[] LIS = new int[nums.length];
//         int max = 1;
//         for (int i = nums.length - 1; i >= 0; i--) {
//             LIS[i] = 1;
//             for (int j = i; j < nums.length; j++) {
//                 if (nums[i] < nums[j])
//                     LIS[i] = Math.max(LIS[i], 1 + LIS[j]);
//                 max = Math.max(LIS[i], max);
//             }
//         }

//         return max;
//     }
// }