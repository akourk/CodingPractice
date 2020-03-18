public class Solution {
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int k = 0;
        for (int i = 0; i < nums.length - k; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1 -k; j++) {
                    nums[j] = nums[j + 1];
                }
                k++;
                i--;
            }
        }
        return nums.length - k;
    }
}

// another simplified solution. instead of focusing on which elements == val,
// do the opposite:
//
//public class Solution {
//    public static int removeElement(int[] nums, int val) {
//        if (nums.length == 0) return 0;
//        int j = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] != val) {
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        return j;
//    }
//}
