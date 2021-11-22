package LeetCode088MergeSortedArray;

// Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

// Note:
//  - The number of elements initialized in nums1 and nums2 are m and n respectively.
//  - You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.

// Example:
// Input:
//  nums1 = [1, 2, 3, 0, 0, 0], m = 3
//  nums2 = [2, 5, 6],          n = 3

// Output: [1, 2, 2, 3, 5, 6]

// Constraints:
//  - -10^9 <= nums1[i], nums2[i] <= 10^9
//  - nums1.length == m + n
//  - nums2.length == n

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        Solution.merge(nums1, 3, nums2, 3);
        System.out.println("\n\nshould be: 1 2 2 3 5 6");
        System.out.print("results  : ");
        for (int j : nums1) {
            System.out.print(j + " ");
        }

        int[] nums3 = {5, 6, 7, 0, 0, 0};
        int[] nums4 = {1, 2, 3};
        Solution.merge(nums3, 3, nums4, 3);
        System.out.println("\n\nshould be: 1 2 3 5 6 7");
        System.out.print("results  : ");
        for (int j : nums3) {
            System.out.print(j + " ");
        }

        int[] nums5 = {4, 0, 0, 0, 0, 0};
        int[] nums6 = {1, 2, 3, 5, 6};
        Solution.merge(nums5, 1, nums6, 5);
        System.out.println("\n\nshould be: 1 2 3 4 5 6");
        System.out.print("results  : ");
        for (int j : nums5) {
            System.out.print(j + " ");
        }

        int[] nums7 = {0, 0, 3, 0, 0, 0, 0, 0, 0};
        int[] nums8 = {-1, 1, 1, 1, 2, 3};
        Solution.merge(nums7, 3, nums8, 6);
        System.out.println("\n\nshould be: -1 0 0 1 1 1 2 3 3");
        System.out.print("results  : ");
        for (int j : nums7) {
            System.out.print(j + " ");
        }

    }
}

// The TreeMap was better than over 90% of solutions in terms of Memory usage, but only 5% in terms of Runtime.
// fastest runtime solution is down below

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0)
            return;

        TreeMap<Integer, Integer> tm = new TreeMap<>();

        int val;
        for (int i = 0; i < m; i++) {
            if (tm.containsKey(nums1[i])) {
                val = tm.get(nums1[i]);
                tm.replace(nums1[i], val + 1);
            } else {
                tm.put(nums1[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (tm.containsKey(nums2[i])) {
                val = tm.get(nums2[i]);
                tm.replace(nums2[i], val + 1);
            } else {
                tm.put(nums2[i], 1);
            }
        }

        int i = 0;
        for (int x : tm.keySet()) {
            for (int j = 0; j < tm.get(x); j++) {
                nums1[i] = x;
                i++;
            }
        }
    }
}


// fastest runtime solution:

//class Solution {
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        while (m > 0 && n > 0) {
//            if (nums2[n - 1] > nums1[m - 1]) {
//                nums1[n + m - 1] = nums2[n - 1];
//                n--;
//            } else {
//                nums1[n + m - 1] = nums1[m - 1];
//                m--;
//            }
//        }
//
//        if (n > 0) {
//            while (n > 0) {
//                nums1[n - 1] = nums2[n - 1];
//                n = n - 1;
//            }
//        } else {
//            while (m > 0) {
//                nums1[m - 1] = nums1[m - 1];
//                m = m - 1;
//            }
//        }
//    }
//}