/*
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("49:"+Solution.maxArea(arr1));

    }
}

class Solution {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            if (height[left] < height[right]) {
                maxArea = Math.max(maxArea, height[left] * (right - left));
                left++;
            } else {
                maxArea = Math.max(maxArea, height[right] * (right - left));
                right--;
            }
        }

        return maxArea;
    }
}

//class Solution {
//    public static int maxArea(int[] height) {
//        int maxArea = 0;
//
//        for (int i = 0; i < height.length; i++) {
//            for (int j = i + 1; j < height.length; j++) {
//                if (height[i] < height[j]) {
//                    if (height[i] * (j - i) > maxArea)
//                        maxArea = height[i] * (j - i);
//                } else
//                    if (height[j] * (j - i) > maxArea)
//                        maxArea = height[j] * (j - i);
//            }
//        }
//
//        return maxArea;
//    }
//}