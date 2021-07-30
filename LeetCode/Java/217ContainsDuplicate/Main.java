package LeetCode217ContainsDuplicate;

//Given an array of integers, find if the array contains any duplicates.
//
//        Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//        Example 1:
//
//        Input: [1,2,3,1]
//        Output: true
//        Example 2:
//
//        Input: [1,2,3,4]
//        Output: false
//        Example 3:
//
//        Input: [1,1,1,3,3,4,3,2,4,2]
//        Output: true

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> map = new HashSet<Integer>();

        for (int num : nums) {
            if (!map.contains(num))
                map.add(num);
            else
                return true;
        }

        return false;
    }
}
