import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> al = new ArrayList<>();
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        al = Solution.threeSum(nums1);
        for (List list  : al) {
            for (Object item : list) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {
                    if (nums[j] + nums[k] == -nums[i]) {
                        al.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1])
                            j++;
                        while (j < k && nums[k] == nums[k - 1])
                            k--;
                        j++;
                        k--;
                    } else if (nums[j] + nums[k] > -nums[i]) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }

        return al;
    }
}

//class Solution {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> al = new ArrayList<>();
//        HashSet<ArrayList<Integer>> hs = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                for (int k = j + 1; k < nums.length; k++) {
//                    if (nums[i] + nums[j] + nums[k] == 0) {
//
//                        ArrayList<Integer> arr = new ArrayList<>();
//                        arr.add(nums[i]);
//                        arr.add(nums[j]);
//                        arr.add(nums[k]);
//                        Collections.sort(arr);
//
//
//                        if (!hs.contains(arr)) {
//                            List<Integer> temp = new ArrayList<Integer>();
//                            temp.add(nums[i]);
//                            temp.add(nums[j]);
//                            temp.add(nums[k]);
//                            al.add(temp);
//                            hs.add(arr);
//                        }
//                    }
//                }
//            }
//        }
//        return al;
//    }
//}