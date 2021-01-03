package LeetCode108ConvertSortedArraytoBinarySearchTree;

// Given an array where elements are sorted in ascending order, convert it to a height balanced BST.

// For this problem, a height-balancing binary tree is defined as a binary tree in which the depth of the two
// subtrees of every node never differ by more than 1.

// ex:
// Given the sorted array: [-10, -3, 0, 5, 9],
// One possible answer is: [0, -3, 9, -10, null, 5], which represents the following height balanced BST:

//      0
//     / \
//    -3  9
//   /   /
// -10  5


import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr1 = new int[] {-10, -3, 0, 5, 9};
//        TreeNode t1 = Solution.sortedArrayToBST(arr1);
//
//        System.out.println("\n new array: \n");
//        int[] arr2 = new int[] {-10, -3, 0, 5, 9, 10};
//        TreeNode t2 = Solution.sortedArrayToBST(arr2);
//
//        System.out.println("\n new array: \n");
//        int[] arr3 = new int[] {};
//        TreeNode t3 = Solution.sortedArrayToBST(arr3);

        System.out.println("\n new array: \n");
        int[] arr4 = new int[] {1, 3};
        TreeNode t4 = Solution.sortedArrayToBST(arr4);

        System.out.println(t4.val);
        if (t4.left != null)
            System.out.print(t4.left.val + "  ");

        if (t4.right != null)
            System.out.println("  " + t4.right.val);
    }
}

class Solution {
    public static TreeNode sortedArrayToBST(int[] nums) {
        TreeNode head = new TreeNode();
        if (nums.length < 1)
            return null;
        if (nums.length == 1)
            return head;

        int left = 0;
        int right = nums.length - 1;
        int mid = (left + right) / 2;

        head.val = nums[mid];

        System.out.println("mid" + mid);
        head.left = findMid(nums, left, mid - 1);
        head.right = findMid(nums, mid + 1, right);
        return head;
    }

    public static TreeNode findMid(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = (left + right) / 2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = findMid(nums, left, mid - 1);
        node.right = findMid(nums, mid + 1, right);

        return node;
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}