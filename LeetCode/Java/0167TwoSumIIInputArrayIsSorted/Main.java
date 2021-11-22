package LeetCode167TwoSumIIInputArrayIsSorted;

// Given an array of integers that is already sorted in ascending order, find two numbers such that they add
// up to a specific target number.

// The function twoSum should return indices of the two numbers such that they add up to the target, where
// index1 must be less than index2.

// Note:
//  - Your returned answers (both index1 and index2) are not zero-based.
//  - You may assume that each input would have exactly one solution and you may not use the same element twice.

// Ex:
// Input:   numbers = [2, 7, 11, 15], target = 9
// Output:  [1, 2]
// Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

// Ex:
// Input:   numbers = [2, 3, 4], target = 6
// Output:  [1, 3]

// Ex:
// Input:   numbers = [-1, 0], target = -1
// Output:  [1, 2]

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[] {2, 7, 11, 15};
        System.out.println(Arrays.toString(Solution.twoSum(a1, 9)));
    }
}

class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                result[0] = start + 1;
                result[1] = end + 1;
                break;
            }
        }
        return result;
    }
}


// basic solution to unsorted list: O(n^2)
//class Solution {
//    public static int[] twoSum(int[] numbers, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < numbers.length; i++) {
//            result[0] = i + 1;
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    result[1] = j + 1;
//                    return result;
//                }
//            }
//        }
//        return result;
//    }
//}