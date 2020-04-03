import java.util.HashSet;

public class Solution {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i]))
                hs.remove(nums[i]);
            else
                hs.add(nums[i]);
        }
        for (int i : hs) {
            return i;
        }
        return 0;
    }
}


/*
// fastest solution:

int a = 0;
for (int i : nums) {
    a^=i;
    }
    return a;
 */
