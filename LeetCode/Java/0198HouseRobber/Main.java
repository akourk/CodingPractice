public class Main {
    public static void main(String[] args) {
        int[] nums0 = {1, 2, 3, 1};
        int[] nums1 = {2, 7, 9, 3, 1};
        int[] nums2 = {6, 3, 10, 8, 2, 10, 3, 5, 10, 5, 3};
        System.out.println("4:" + Solution.rob(nums0));
        System.out.println("12:" + Solution.rob(nums1));
        System.out.println("39:" + Solution.rob(nums2));
    }
}

// O(n)
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


// well, this works, but it's slow and innefficient...
// O(n^2)
// class Solution {
//     public static int rob(int[] nums) {
//         int[] sums = new int[nums.length];
//         int max = 0;

//         for (int i = 0; i < sums.length; i++) {
//             sums[i] = nums[i];
//             int localmax = nums[i];
//             for (int j = 0; j < i - 1; j++)
//                 localmax = Math.max(localmax, sums[i] + sums[j]);
//             sums[i] = localmax;
            
//             if (sums[i] > max)
//                 max = sums[i];
//         }

//         return max;
//     }
// }