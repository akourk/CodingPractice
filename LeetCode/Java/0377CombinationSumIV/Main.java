public class Main {
    public static void main(String[] args) {
        int[] nums0 = {1, 2, 3};
        System.out.println("7:" + Solution.combinationSum4(nums0, 4));
    }
}

class Solution {
    public static int combinationSum4(int[] nums, int target) {
        int[] coms = new int[target + 1];

        coms[0] = 1;
        for (int i = 1; i < coms.length; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    coms[i] += coms[i - num];
                }
            }
        }
        return coms[target];
    }
}