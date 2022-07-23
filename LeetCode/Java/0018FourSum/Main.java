import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Main {
    public static void main(String[] args) {
        int[] l1 = {-3, -2, -1, 0, 0, 1, 2, 3};
        System.out.println("[[-3, -2, 2, 3], [-3, -1, 1, 3], [-3, 0, 0, 3], [-3, 0, 1, 2], [-2, -1, 0, 3], [-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]");
        System.out.println(Solution.fourSum(l1, 0));

        int[] l2 = {1000000000,1000000000,1000000000,1000000000};
        System.out.println("[]");
        System.out.println(Solution.fourSum(l2, -294967296));

    }
}

class Solution {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> hs = new HashSet<>();
        Arrays.sort(nums);
        
        if (nums.length < 4)
            return result;

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                long tempTar = target;
                tempTar -= (nums[i] + nums[j]);
                
                while (left < right) {
                    if (nums[left] + nums[right] < tempTar) {
                        left++;
                    } else if (nums[left] + nums[right] > tempTar) {
                        right--;
                    } else {
                        if (!hs.contains(Arrays.asList(nums[i], nums[j], nums[left], nums[right]))) {
                            result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                            hs.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        }
                        left++;
                    }
                }
            }
        }

        return result;
    }
}