package LeetCode169MajorityElement;

// Given an array of size n, find the majority element. The majority element is the element that appears
// more than [FLOOR]n/2[FLOOR] times.

// You may assume that the array is non-empty and the majority element always exist in the array.

// Ex:
// Input:   [3, 2, 3]
// Output:  3

// Ex:
// Input:   [2, 2, 1, 1, 1, 2, 2]
// Output:  2

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[] {3, 2, 3};
        System.out.println("3:" + Solution.majorityElement(arr1));
        int[] arr2 = new int[] {2, 2, 1, 1, 1, 2, 2};
        System.out.println("2:" + Solution.majorityElement(arr2));
    }
}

class Solution {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int maxcounter = 1;
        int max = nums[0];
        hmap.put(nums[0], 1);

        for (int i = 1; i < nums.length; i++) {
            if (hmap.containsKey(nums[i])) {
                hmap.put(nums[i], hmap.get(nums[i]) + 1);
                if (hmap.get(nums[i]) > maxcounter) {
                    maxcounter = hmap.get(nums[i]);
                    max = nums[i];
                }
            } else {
                hmap.put(nums[i], 1);
            }
        }
        return max;
    }
}
